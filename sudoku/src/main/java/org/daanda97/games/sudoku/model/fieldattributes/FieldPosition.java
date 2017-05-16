package org.daanda97.games.sudoku.model.fieldattributes;

/**
 * The FieldPosition is the Number of the Field
 *
 */
public class FieldPosition {
	private int fieldPosition;
	
	public FieldPosition(int fieldPosition) {
		setFieldPosition(fieldPosition);
	}

	private void setFieldPosition(int fieldPosition) {
		this.fieldPosition = fieldPosition;
	}
	
	public int getFieldPosition(){
		return fieldPosition;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + fieldPosition;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FieldPosition other = (FieldPosition) obj;
		if (fieldPosition != other.fieldPosition)
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return this.getFieldPosition() + "";
	}
}
