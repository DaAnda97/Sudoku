package org.daanda97.games.sudoku.exceptions;

public class InvalidNumber extends Exception {
	
	public InvalidNumber() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "The number you set is outside the valid range.";
	}
}
