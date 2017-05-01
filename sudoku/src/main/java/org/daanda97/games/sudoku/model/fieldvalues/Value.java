package org.daanda97.games.sudoku.model.fieldvalues;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This Attribute is the value of the Field <br>
 * Its value is 0, by setting no other valid value
 */
public class Value{
	int value;

	public Value(int value) throws InvalidNumber {
		setValue(value);
	}
	
	public Value() {
		this.value = 0;
	}

	public void setValue(int value) throws InvalidNumber {
		// TODO Check if that value is already in one of row, box or column
		if (value >= 1 & value <= 9) {
			this.value = value;
		} else {
			throw new InvalidNumber();
		}
	}
	
	public int getValue(){
		return value;
	}
	
	

}
