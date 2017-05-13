package org.daanda97.games.sudoku.model.fieldvalues;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This Attribute is the value of the Field <br>
 * Its value is 0, by setting no other valid value
 */
public class FieldValue{
	int fieldValue;

	public FieldValue(int ownValue) throws InvalidNumber {
		setFieldValue(ownValue);
	}
	
	public FieldValue() {
		this.fieldValue = 0;
	}

	public void setFieldValue(int fieldValue) throws InvalidNumber {
		// TODO Check if that value is already in one of row, box or column
		if (fieldValue >= 1 & fieldValue <= 9) {
			this.fieldValue = fieldValue;
		} else {
			throw new InvalidNumber();
		}
	}
	
	public int getOwnValue(){
		return fieldValue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fieldValue;
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
		FieldValue other = (FieldValue) obj;
		if (fieldValue != other.fieldValue)
			return false;
		return true;
	}
	
}
