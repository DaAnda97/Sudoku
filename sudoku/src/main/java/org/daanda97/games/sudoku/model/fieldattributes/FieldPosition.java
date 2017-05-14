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
	 * 
	 * @param RowNumber: The number of the fields row
	 * @param ColumnNumber: The number of the fields column
	 * @return Integer value of the field
	 */
	public static int getFieldNumber (RowNumber rowNumber, ColumnNumber columnNumber){
		return FieldNumber.getFieldNumber(rowNumber, columnNumber);
	}
	
	protected boolean containsRowOrColumn(FieldPosition fieldPosition) {
		if(fieldPosition.equalsRow(this.rowNumber)){
			return true;
		}
		if(fieldPosition.equalsColumn(this.columnNumber)){
			return true;
		}
		return false;
	}

	private boolean equalsRow(RowNumber rowNumber) {
		return this.rowNumber.equals(rowNumber);
	}

	private boolean equalsColumn(ColumnNumber columnNumber) {
		return this.columnNumber.equals(columnNumber);
	}

	@Override
	public String toString() {
		return "(" + columnNumber.toString() + "," + rowNumber.toString() + ")";
	}
}
