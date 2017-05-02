package org.daanda97.games.sudoku.model.fieldvalues;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This Attribute is the value of the Field <br>
 * Its value is 0, by setting no other valid value
 */
public class OwnValue{
	int ownValue;

	public OwnValue(int ownValue) throws InvalidNumber {
		setOwnValue(ownValue);
	}
	
	public OwnValue() {
		this.ownValue = 0;
	}

	public void setOwnValue(int ownValue) throws InvalidNumber {
		// TODO Check if that value is already in one of row, box or column
		if (ownValue >= 1 & ownValue <= 9) {
			this.ownValue = ownValue;
		} else {
			throw new InvalidNumber();
		}
	}
	
	public int getOwnValue(){
		return ownValue;
	}
	
	

}
