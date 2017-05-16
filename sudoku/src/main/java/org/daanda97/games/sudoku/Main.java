package org.daanda97.games.sudoku;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.daanda97.games.sudoku.model.Fields;

public class Main 
{
	public static void main(String[] args) {
		try {
			Fields fields = new Fields();
		} catch (InvalidNumber e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
