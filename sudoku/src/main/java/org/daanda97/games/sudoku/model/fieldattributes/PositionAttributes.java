package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * This class maintains FieldPosition and BoxNumber
 *
 */
public class PositionAttributes {
	private FieldPosition fieldPosition;
	private BoxNumber boxNumber;

	public PositionAttributes(FieldPosition fieldPosition) throws InvalidNumber {
		this.fieldPosition = fieldPosition;
		boxNumber = new BoxNumber(BoxNumber.getBoxNumber(fieldPosition));
	}

	@Override
	public String toString() {
		return fieldPosition.getFieldNumber() + fieldPosition.toString() + "[" + boxNumber.toString() + "]";
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
	
	private boolean containsRowOrColumn(FieldPosition fieldPosition) {
		return this.fieldPosition.containsRowOrColumn(fieldPosition);
	}

	private boolean equalsBoxNumber(BoxNumber boxNumber){
		return this.boxNumber.equals(boxNumber);
	}

}
