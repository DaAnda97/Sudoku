package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

public class Column {
	private int column;
	
	/*
	 * This class wraps the column number
	 * 
	 * @param valid number between in the range of 1 to 9
	 */
	public Column(int column) throws InvalidNumber {
		setColumn(column);
	}
	
	private void setColumn(int column) throws InvalidNumber {
		if (column >= 1 & column <= 9){
			this.column = column;
		} else {
			throw new InvalidNumber();
		}
		
	}
}
