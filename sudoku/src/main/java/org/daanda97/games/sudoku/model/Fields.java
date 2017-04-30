package org.daanda97.games.sudoku.model;

import java.util.ArrayList;
import java.util.List;

import org.daanda97.games.sudoku.exceptions.InvalidSize;

/*
 * This class contains all 81 Field objects of the Board
 */
public class Fields {
	private List<Field> fields;
	
	public Fields(ArrayList<Field> fields) throws InvalidSize {
		setFields(fields);
	}
	
	private void setFields(ArrayList<Field> fields) throws InvalidSize{
		if (fields.size() == 81){
			this.fields = fields;
		} else {
			throw new InvalidSize();
		}
		
	}
	
}
