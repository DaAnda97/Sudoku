package org.daanda97.games.sudoku.model.fieldattributes;

import static org.junit.Assert.assertEquals;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.junit.Before;
import org.junit.Test;


public class TestBoxNumber {
	FieldCoordinate fieldPosition1 = null;
	FieldCoordinate fieldPosition2 = null;
	FieldCoordinate fieldPosition3 = null;
	
	@Before
	public void initilize(){
		try {
			fieldPosition1 = new FieldCoordinate(new RowNumber(4), new  ColumnNumber(3));
			fieldPosition2 = new FieldCoordinate(new RowNumber(9), new  ColumnNumber(6));
			fieldPosition3 = new FieldCoordinate(new RowNumber(9), new  ColumnNumber(9));
		} catch (InvalidNumber e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testGetBoxNumber(){
		assertEquals(4, BoxNumber.getBoxNumber(fieldPosition1));
		assertEquals(8, BoxNumber.getBoxNumber(fieldPosition2));
		assertEquals(9, BoxNumber.getBoxNumber(fieldPosition3));
	}
	
	// Change the private modifier of the methods to public first
//	@Test
//	public void testCalculateHorizontalBoxSection(){
//		assertEquals(1, BoxNumber.calculateHorizontalBoxSection(fieldPosition1));
//		assertEquals(2, BoxNumber.calculateHorizontalBoxSection(fieldPosition2));
//		assertEquals(3, BoxNumber.calculateHorizontalBoxSection(fieldPosition3));
//	}
//	
//	@Test
//	public void testCalculateVerticalBoxSection(){
//		assertEquals(2, BoxNumber.calculateVerticalBoxSection(fieldPosition1));
//		assertEquals(3, BoxNumber.calculateVerticalBoxSection(fieldPosition2));
//		assertEquals(3, BoxNumber.calculateVerticalBoxSection(fieldPosition3));
//	}
}
