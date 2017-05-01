package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

public abstract class FieldAttribute {
	private int value;
	
	public FieldAttribute(int value) throws InvalidNumber {
		setValue(value);
	}

	private void setValue(int value) throws InvalidNumber {
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
