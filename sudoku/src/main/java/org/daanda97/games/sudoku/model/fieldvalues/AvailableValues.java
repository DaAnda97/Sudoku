package org.daanda97.games.sudoku.model.fieldvalues;

import java.util.ArrayList;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * Maintains the fields, which are still available
 * 
 */
public class AvailableValues {
	// excluded values
	private boolean[] availableValues = new boolean[9];

	public AvailableValues() {
		for (int i = 0; i < availableValues.length; i++) {
			availableValues[i] = true;
		}
	}

	/**
	 * excludes the Value, which is impossible for this field
	 */
	public void excludeValue(FieldValue value) {
		if (value.getOwnValue() != 0) { // Free fields have the value 0
			int valueNumber = value.getOwnValue();
			availableValues[valueNumber - 1] = false;
		}
	}

	public ArrayList<FieldValue> getAvailableValues() {
		ArrayList<FieldValue> stillAvailableValues = new ArrayList<FieldValue>();
		for (int i = 0; i < availableValues.length; i++) {
			if (availableValues[i]) {
				try {
					stillAvailableValues.add(new FieldValue(i + 1));
					System.out.println("Added: " + (i + 1));
				} catch (InvalidNumber e) {
					System.out.println("INTERNAL ARRAY ERROR: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}
		return stillAvailableValues;
	}

	public void excludeAllValues() {
		for (int i = 1; i <= 9; i++){
			availableValues[i] = false;
		}
		
	}
}
