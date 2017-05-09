package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * The columns number my field is in
 */
public class ColumnNumber extends FieldNumber {

	public ColumnNumber(int column) throws InvalidNumber {
		super(column);
	}
	
//	public void add(RowNumber row) {
//		row.add(value);
//	}
//	public void add(int row)
//	{
//		int result = value + row;
//	}
}
