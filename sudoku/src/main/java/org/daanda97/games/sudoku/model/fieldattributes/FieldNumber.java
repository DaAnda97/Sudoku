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
	
	public int getValue(){
		return value;
	}
	
	public int getFieldNumber (BoxNumber boxNumber, ColumnNumber columnNumber){
		return calculateFieldNumber(boxNumber, columnNumber);
	}
	private int calculateFieldNumber (FieldNumber boxNumber, FieldNumber columnNumber){
		return boxNumber.value + columnNumber.value;
	}
	
}
