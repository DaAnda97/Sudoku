package org.daanda97.games.sudoku.model.fieldvalues;

/**
 * Maintains the OwnValue from the OwnValue and manages the Values, which are
 * still possible
 *
 */
public class FieldValues {
	private OwnValue ownValue;
	private AvailableValues availableValues;

	public FieldValues(OwnValue ownValue) {
		availableValues = new AvailableValues();
		this.ownValue = ownValue;
		excludeValue(ownValue);
	}

	private void excludeValue(OwnValue valueToExclude) {
		availableValues.excludeValue(valueToExclude);
	}

}
