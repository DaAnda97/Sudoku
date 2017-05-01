package org.daanda97.games.sudoku.model.fieldattributes;

public class FieldPosition {
	RowNumber rowNumber;
	ColumnNumber columnNumber;

	public FieldPosition(RowNumber rowNumber, ColumnNumber columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}

	/**
	 * The fields on the board are numbered from 1 to 81. Field 1 is the cross
	 * of column 1 and row 1. <br>
	 * f.ex.: Field 56 is in column 2 row 7
	 * 
	 * @return fieldnumber
	 */
	/*
	 * Calculation: f.ex.: Field 56 is in column 2 row 7
	 * (54 = 2 * 9 - (9 - 7)) <br>
	 * 
	 * The minuend represents the the last field of the row and gets reduced by
	 * the subtraction of the row length and value of the column
	 */
	public int getFieldNumber() {
		int fieldnumber = rowNumber.getValue() * 9 - (9 - columnNumber.getValue());
		return fieldnumber;
	}

}