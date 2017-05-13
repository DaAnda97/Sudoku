package org.daanda97.games.sudoku.model.fieldvalues;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.junit.Test;

public class TestAvailableValues {
	
	@Test
	public void checkAvailableValuesIsEmthy(){
		AvailableValues availableValues = new AvailableValues();
		
		ArrayList<FieldValue> expectedValues = new ArrayList<FieldValue>();
		for (int i = 1; i <= 9; i++){
			try {
				expectedValues.add(new FieldValue(i));
				System.out.println("Test added:" + i);
			} catch (InvalidNumber e) {
				System.out.println("TEST FEHLGESCHLAGEN: " + e.getMessage());
				e.printStackTrace();
			}
		}
		ArrayList<FieldValue> ownValues = availableValues.getAvailableValues();
		
		for (int i = 0; i < ownValues.size(); i++) {
			assertEquals(expectedValues.get(i).getOwnValue(), ownValues.get(i).getOwnValue());
		}
	}
	
	
}
