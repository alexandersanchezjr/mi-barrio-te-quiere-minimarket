package model;

import java.time.LocalDate;
import java.util.ArrayList;

import exceptions.SameParityException;
import exceptions.UnderAgeException;

public class Minimarket {
	private ArrayList<Person> peopleEntered;
	private long counter;
	/**
	 * @param peopleEntered
	 * @param counter
	 */
	public Minimarket() {
		this.peopleEntered = new ArrayList <Person>();
		this.counter = 0;
	}
	/**
	 * @return the peopleEntered
	 */
	public ArrayList<Person> getPeopleEntered() {
		return peopleEntered;
	}
	/**
	 * @param peopleEntered the peopleEntered to set
	 */
	public void setPeopleEntered(ArrayList<Person> peopleEntered) {
		this.peopleEntered = peopleEntered;
	}
	/**
	 * @return the counter
	 */
	public long getCounter() {
		return counter;
	}
	/**
	 * @param counter the counter to set
	 */
	public void setCounter(long counter) {
		this.counter = counter;
	}
	
	public void addPerson (int documentTypeNumber, String id) throws UnderAgeException, SameParityException {
		
		counter++;
		
		int secondLastNumber = Integer.parseInt(String.valueOf(id.charAt(id.length()-2)));

		if (documentTypeNumber == 1)
			throw new UnderAgeException ();
		if ((secondLastNumber % 2 == 0 && LocalDate.now().getDayOfMonth() % 2 == 0) || (secondLastNumber % 2 != 0 && LocalDate.now().getDayOfMonth() % 2 != 0))
			throw new SameParityException (LocalDate.now().getDayOfMonth(), secondLastNumber);
		DocumentType documentType = null;
		switch (documentTypeNumber) {
		case 1:
			documentType = DocumentType.TI;
		case 2:
			documentType = DocumentType.CC;
		case 3:
			documentType = DocumentType.PP;
		case 4:
			documentType = DocumentType.CE;
		}
		Person newPerson = new Person (documentType, id);
		peopleEntered.add(newPerson);
	}
	
	
}
