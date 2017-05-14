package org.daanda97.games.sudoku.model.fieldvalues;

/**
 * Maintains the OwnValue from the OwnValue and manages the Values, which are
 * still possible
 *
 */
public class FieldValueManager {
	private FieldValue ownValue;
	private AvailableValues availableValues;

	public FieldValueManager() {
		availableValues = new AvailableValues();
		this.ownValue = new FieldValue();
	}

	public void setValue(FieldValue fieldValue) {
		if (ownValue.equals(new FieldValue())) { // must only be set once a time
			ownValue = fieldValue;
			availableValues.excludeAllValues();
		}
		// TODO throw internalErrorException
	}

	public void excludeValue(FieldValueManager changedValue) {
		excludeChangedValue(this.availableValues);
	}

	private void excludeChangedValue(AvailableValues ownFieldValueManager) {
		ownFieldValueManager.excludeValue(this.ownValue); 
		// this.ownValue is the OwnVlaue of changedField
	}
	
	

}
