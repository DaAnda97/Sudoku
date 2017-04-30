package org.daanda97.games.sudoku.model.fieldcollections;

import java.util.ArrayList;
import java.util.List;

import org.daanda97.games.sudoku.model.fieldattributes.FieldAttribute;

public abstract class FieldCollection {
	private List<FieldAttribute> values;
	
	public FieldCollection(ArrayList<FieldAttribute> values) {
		setValues(values);
	}

	private void setValues(ArrayList<FieldAttribute> values) {
		this.values = values;
	}
	
	
}
