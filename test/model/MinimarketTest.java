package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import exceptions.SameParityException;
import exceptions.UnderAgeException;

class MinimarketTest {
	
	private Minimarket minimarket;
	
	public void setupScenary1 () {
		minimarket = new Minimarket ();
	}
	@Test
	void testSuccesfulEntry() throws UnderAgeException, SameParityException {
		setupScenary1();
		
		int documentType = 3;
		String id = "JAP192962K";
		
		minimarket.addPerson(documentType, id);
		
		ArrayList<Person> people = minimarket.getPeopleEntered();
		assertEquals(1, people.size());
		
		Person p = people.get(0);
		assertEquals(DocumentType.PP, p.getDocumentType());
		assertEquals(id, p.getId());
	}
	
	@Test
	void testUnderAgeException() throws SameParityException {
		setupScenary1();
		
		int documentType = 1;
		String id = "1113839617";
		
		try {
			minimarket.addPerson(documentType, id);
			fail();
		} catch (UnderAgeException e) {

			ArrayList<Person> people = minimarket.getPeopleEntered();
			assertEquals(0, people.size());
			
			e.printStackTrace();
		}
	}
	
	@Test
	void testSameParityException() throws UnderAgeException {
		setupScenary1();
		
		int documentType = 2;
		String id = "1006307973";
		
		try {
			minimarket.addPerson(documentType, id);
			fail();
		} catch (SameParityException e) {

			ArrayList<Person> people = minimarket.getPeopleEntered();
			assertEquals(0, people.size());
			
			e.printStackTrace();
		}
	}

}
