package org.daanda97.games.sudoku.model.fieldattributes;

public class FieldCoordinate {
	RowNumber rowNumber;
	ColumnNumber columnNumber;

	public FieldCoordinate(RowNumber rowNumber, ColumnNumber columnNumber) {
		this.rowNumber = rowNumber;
		this.columnNumber = columnNumber;
	}

	/**
	 * @return FieldPosition of this Object
	 */
	public FieldPosition getFieldNumber() {
		return getFieldNumber(this.rowNumber, this.columnNumber);
	}

	/**
	 * 
	 * @param RowNumber: The number of the fields row
	 * @param ColumnNumber: The number of the fields column
	 * @return Integer value of the field
	 */
	public static FieldPosition getFieldNumber (RowNumber rowNumber, ColumnNumber columnNumber){
		return FieldNumber.getFieldPosition(rowNumber, columnNumber);
	}
	
	protected boolean containsRowOrColumn(FieldCoordinate fieldPosition) {
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
