package org.daanda97.games.sudoku.model.fieldattributes;

public class FieldPosition {
	RowNumber rowNumber;
	ColumnNumber columnNumber;

	public FieldPosition(RowNumber rowNumber, ColumnNumber columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}

	/**
	 * @return fieldnumber of this Object
	 */
	public int getFieldNumber() {
		return getFieldNumber(this.rowNumber, this.columnNumber);
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
	 * the subtraction of the column length and value of the row
	 */
	public static int getFieldNumber (RowNumber rowNumber, ColumnNumber columnNumber){
		int fieldnumber = columnNumber.getValue() * 9 - (9 - rowNumber.getValue());
		return fieldnumber;
	}

}
