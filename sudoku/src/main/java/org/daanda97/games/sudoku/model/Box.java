package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

public class Box {
	private int box;

	/*
	 * This class wraps the box number
	 * 
	 * @param valid number between in the range of 1 to 9
	 */
	public Box(int box) throws InvalidNumber {
		setColumn(box);
	}

	private void setColumn(int box) throws InvalidNumber {
		if (box >= 1 & box <= 9) {
			this.box = box;
		} else {
			throw new InvalidNumber();
		}

	}

	public boolean isValidCombination(Row row, Column col) {
		switch (box) {
		case 1:

			break;
		case 2:

			break;
		case 3:

			break;
		case 4:

			break;
		case 5:

			break;
		case 6:

			break;
		case 7:

			break;
		case 8:

			break;
		case 9:

			break;
		default:
			break;
		}

		return false;
	}
}
