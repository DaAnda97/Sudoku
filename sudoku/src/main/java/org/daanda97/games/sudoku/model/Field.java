package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.model.fieldattributes.PositionAttributes;
import org.daanda97.games.sudoku.model.fieldvalues.FieldValues;
import org.daanda97.games.sudoku.model.fieldvalues.OwnValue;

/**
 * This class represents one Field on the Board
 *
 */
public class Field {
	PositionAttributes positionAttributes;
	FieldValues fieldValues;
	
	public Field(PositionAttributes positionAttributes) {
		this.positionAttributes = positionAttributes;
		this.fieldValues = new FieldValues(new OwnValue());
	}
}
