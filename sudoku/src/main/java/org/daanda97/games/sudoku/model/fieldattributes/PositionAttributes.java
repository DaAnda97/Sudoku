package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This class maintains FieldPosition and BoxNumber
 *
 */
public class PositionAttributes {
	FieldPosition fieldPosition;
	BoxNumber boxNumber;

	public PositionAttributes(FieldPosition fieldPosition) throws InvalidNumber {
		this.fieldPosition = fieldPosition;
		boxNumber = new BoxNumber(BoxNumber.getBoxNumber(fieldPosition));
	}

	@Override
	public String toString() {
		return fieldPosition.getFieldNumber() + fieldPosition.toString() + "[" + boxNumber.toString() + "]";
	}

}
