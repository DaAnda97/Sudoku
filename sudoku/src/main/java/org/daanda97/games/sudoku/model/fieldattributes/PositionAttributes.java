package org.daanda97.games.sudoku.model.fieldattributes;

/**
 * This class maintains FieldPosition and BoxNumber
 *
 */
public class PositionAttributes {
	FieldPosition fieldPosition;
	BoxNumber boxNumber;
	
	public PositionAttributes(FieldPosition fieldPosition, BoxNumber boxNumber) {
		setAttributes(fieldPosition, boxNumber);
	}

	private void setAttributes(FieldPosition fieldPosition, BoxNumber boxNumber) {
		// TODO Is that combination possible?
		this.fieldPosition = fieldPosition;
		this.boxNumber = boxNumber;
	}
}
