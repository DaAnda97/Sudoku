package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

public class Board {
	Fields fields;
	
	public Board() throws InvalidNumber {
		this.fields = new Fields();
	}


}
