package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * A FieldAtrribute wraps the Column, the Row and the Box to ensure the value range from 1 to 9
 *
 */
public abstract class FieldNumber {
	private int value;
	
	public FieldNumber(int value) throws InvalidNumber {
		setValue(value);
	}

	private void setValue(int value) throws InvalidNumber {
		if (value >= 1 & value <= 9) {
			this.value = value;
		} else {
			throw new InvalidNumber();
		}
	}
	
	private int getValue(){
		return value;
	}
	
	/**
	 * The fields on the board are numbered from 1 to 81. Field 1 is the cross
	 * of column 1 and row 1. <br>
	 * e.g.: Field 56 is in column 2 row 7
	 * 
	 * @param RowNumber: The number of the fields row
	 * @param ColumnNumber: The number of the fields column
	 * @return Integer value of the field
	 */
	public static int getFieldNumber (RowNumber rowNumber, ColumnNumber columnNumber){
		return calculateFieldNumber(rowNumber, columnNumber);
	}
	
	/**
	 * Calculation: f.ex.: Field 56 is in column 2 row 7
	 * (54 = 2 * 9 - (9 - 7)) <br>
	 * 
	 * The minuend represents the the last field of the row and gets reduced by
	 * the subtraction of the column length and value of the row
	 */
	private static int calculateFieldNumber (FieldNumber rowNumber, FieldNumber columnNumber){
		int fieldnumber = rowNumber.getValue() * 9 - (9 - columnNumber.getValue());
		return fieldnumber;
	}
	
	@Override
	public String toString() {
		return this.getValue() + "";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FieldNumber other = (FieldNumber) obj;
		if (value != other.value)
			return false;
		return true;
	}
	
}
