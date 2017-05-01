package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * The columns number my field is in
 */
public class ColumnNumber extends FieldNumbers {

	public ColumnNumber(int column) throws InvalidNumber {
		super(column);
	}
}
