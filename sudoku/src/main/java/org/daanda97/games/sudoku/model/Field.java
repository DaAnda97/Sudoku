package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.model.fieldattributes.PositionAttributes;
import org.daanda97.games.sudoku.model.fieldvalues.FieldValueManager;

/**
 * This class represents one Field on the Board
 *
 */
public class Field {
	private PositionAttributes positionAttributes;
	private FieldValueManager fieldValueManager;

	public Field(PositionAttributes positionAttributes) {
		this.positionAttributes = positionAttributes;
		this.fieldValueManager = new FieldValueManager();
	}

	/**
	 * Excludes the changedFields ownValue, if this field equals with minimum
	 * one of row, column or box
	 * 
	 * @param changedField
	 */
	public void excludeFieldValueIfAffaced(Field changedField) {
		if (changedField.isContainedBy(this.positionAttributes)) {
			changedField.excludeValueOfChangedField(fieldValueManager);
		}
	}

	private void excludeValueOfChangedField(FieldValueManager ownFieldValues) {
		ownFieldValues.excludeValue(this.fieldValueManager);
		// this.fieldValueManager is the FieldValueManager of changedField
	}

	/**
	 * 
	 * @param ownPositionAttributed
	 * @return ture, if the ownPositionAttributes contains minimum the same Row,
	 *         Column or Box
	 */
	private boolean isContainedBy(PositionAttributes ownPositionAttributed) {
		return ownPositionAttributed.containsRowColumnOrBox(this.positionAttributes);
		// this.positionAttribues are the PositionAttributes of changedField
	}
}
