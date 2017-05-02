package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.model.fieldattributes.PositionAttributes;
import org.daanda97.games.sudoku.model.fieldvalues.FieldValues;

/**
 * This class represents one Field on the Board
 *
 */
public class Field {
	PositionAttributes positionAttributes;
	FieldValues fieldValues;
	
	public Field(FieldValues fieldValues, PositionAttributes positionAttributes) {
		this.fieldValues = fieldValues;
		this.positionAttributes = positionAttributes;
	}
}
