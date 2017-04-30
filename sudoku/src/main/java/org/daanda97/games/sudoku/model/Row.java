package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

public class Row{
	private int row;
	
	/*
	 * This class wraps the row number
	 * 
	 * @param valid number between in the range of 1 to 9
	 */
	public Row(int column) throws InvalidNumber {
		setColumn(column);
	}
	
	private void setColumn(int row) throws InvalidNumber {
		if (row >= 1 & row <= 9){
			this.row = row;
		} else {
			throw new InvalidNumber();
		}
	}

}
