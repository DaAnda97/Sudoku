package org.daanda97.games.sudoku.model.fieldattributes;

import static org.junit.Assert.assertEquals;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.junit.Test;

public class TestFieldPosition {
	
	@Test
	public void testGetFieldNumber(){
		FieldPosition fieldPos = null;
		try {
			fieldPos = new FieldPosition(new RowNumber(7), new ColumnNumber(2));
		} catch (InvalidNumber e) {
			System.out.println("TEST FAILED: " + e.getMessage());
		}
		assertEquals(56, fieldPos.getFieldNumber());
	}
}
