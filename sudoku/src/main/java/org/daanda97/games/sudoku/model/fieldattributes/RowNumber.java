package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * The rows number my field is in
 */
public class RowNumber extends FieldNumber{

	public RowNumber(int rowNumber) throws InvalidNumber {
		super(rowNumber);
	}
	
//	public void add(ColumnNumber column) {
//		column.add(value);
//	}
//	public void add(int row)
//	{
//		int result = value + row;
//	}

}
