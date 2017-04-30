package org.daanda97.games.sudoku.exceptions;


public class InvalidSize extends Exception{
	
	public InvalidSize() {
		super();
	}
	
	@Override
	public String getMessage() {
		return "The size of your object is not as expected.";
	}
}
