package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This class maintains FieldPosition and BoxNumber
 *
 */
public class PositionAttributes {
	private FieldCoordinate fieldPosition;
	private BoxNumber boxNumber;

	public PositionAttributes(FieldCoordinate fieldPosition) throws InvalidNumber {
		this.fieldPosition = fieldPosition;
		boxNumber = new BoxNumber(BoxNumber.getBoxNumber(fieldPosition));
	}

	@Override
	public String toString() {
		return fieldPosition.getFieldNumber().toString() + fieldPosition.toString() + "[" + boxNumber.toString() + "]";
	}
	
	public boolean containsRowColumnOrBox(PositionAttributes positionAttributes){
		if(positionAttributes.equalsBoxNumber(this.boxNumber)){
			return true;
		}
		if (positionAttributes.containsRowOrColumn(this.fieldPosition)){
			return true;
		}
		return false;
		
	}
	
	private boolean containsRowOrColumn(FieldCoordinate fieldPosition) {
		return this.fieldPosition.containsRowOrColumn(fieldPosition);
	}

	private boolean equalsBoxNumber(BoxNumber boxNumber){
		return this.boxNumber.equals(boxNumber);
	}

}
