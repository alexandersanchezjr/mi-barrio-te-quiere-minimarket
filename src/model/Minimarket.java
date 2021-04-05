package model;

import java.util.ArrayList;

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
	
	
	
}
