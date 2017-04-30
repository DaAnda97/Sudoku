package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/*
 * The 3*3 box my field is in
 */
public class BoxNumber extends FieldAttribute{

	public BoxNumber(int boxNumber) throws InvalidNumber {
		super(boxNumber);
	}


}
