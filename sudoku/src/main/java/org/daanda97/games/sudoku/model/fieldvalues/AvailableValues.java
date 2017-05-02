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
			System.out.println(i + ": true");
		}
	}

	/**
	 * excludes the Value, which is impossible for this field
	 */
	public void excludeValue(OwnValue value) {
		if (value.getOwnValue() != 0) { // Not set values are 0
			int valueNumber = value.getOwnValue();
			availableValues[valueNumber - 1] = false;
		}
	}

	public ArrayList<OwnValue> getAvailableValues() {
		ArrayList<OwnValue> stillAvailableValues = new ArrayList<OwnValue>();
		for (int i = 0; i < availableValues.length; i++) {
			if (availableValues[i]) {
				try {
					stillAvailableValues.add(new OwnValue(i + 1));
					System.out.println("Added: " + (i + 1));
				} catch (InvalidNumber e) {
					System.out.println("INTERNAL ARRAY ERROR: " + e.getMessage());
					e.printStackTrace();
				}
			}
		}
		return stillAvailableValues;
	}
}
