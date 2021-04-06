package exceptions;

public class SameParityException extends Exception {
	
	private int secondLastNumber; 
	private int dayOfTheMonth;

	public SameParityException(int dayOfTheMonth, int secondLastNumber) {
		super("The parity of the second last number of the id and the current day of the month are the same");
		this.dayOfTheMonth = dayOfTheMonth;
		this.secondLastNumber = secondLastNumber;
		
	}

	/**
	 * @return the secondLastNumber
	 */
	public int getSecondLastNumber() {
		return secondLastNumber;
	}

	/**
	 * @param secondLastNumber the secondLastNumber to set
	 */
	public void setSecondLastNumber(int secondLastNumber) {
		this.secondLastNumber = secondLastNumber;
	}

	/**
	 * @return the dayOfTheMonth
	 */
	public int getDayOfTheMonth() {
		return dayOfTheMonth;
	}

	/**
	 * @param dayOfTheMonth the dayOfTheMonth to set
	 */
	public void setDayOfTheMonth(int dayOfTheMonth) {
		this.dayOfTheMonth = dayOfTheMonth;
	}


}
