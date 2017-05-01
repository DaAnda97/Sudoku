package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/*
 * There should be the possibility to build 2*2, 3*3 and 4*4 Boards
 */
public class BoardSize {
	private int boardSize;
	
	public BoardSize(int boardSize) throws InvalidNumber {
		setBoardSize(boardSize);
	}

	private void setBoardSize(int boardSize) throws InvalidNumber {
		if (boardSize >= 2 & boardSize <=4){
			this.boardSize = boardSize;
		} else {
			throw new InvalidNumber();
		}
		
	}
}
