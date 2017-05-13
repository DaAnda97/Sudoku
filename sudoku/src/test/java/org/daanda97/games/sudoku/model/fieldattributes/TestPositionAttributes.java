package org.daanda97.games.sudoku.model.fieldattributes;

import static org.junit.Assert.assertEquals;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.junit.Before;
import org.junit.Test;

public class TestPositionAttributes {
	PositionAttributes positionAttributes;
	PositionAttributes positionAttributes2;
	PositionAttributes positionAttributes3;
	PositionAttributes positionAttributes4;
	
	@Before
	public void initialize(){
		try {
			FieldPosition fieldPosition = new FieldPosition(new RowNumber(3), new ColumnNumber(5));
			FieldPosition fieldPosition2 = new FieldPosition(new RowNumber(7), new ColumnNumber(5)); //same column
			FieldPosition fieldPosition3 = new FieldPosition(new RowNumber(3), new ColumnNumber(1)); //same row
			FieldPosition fieldPosition4 = new FieldPosition(new RowNumber(2), new ColumnNumber(4)); //same box
			
			positionAttributes = new PositionAttributes(fieldPosition);
			positionAttributes2 = new PositionAttributes(fieldPosition2);
			positionAttributes3 = new PositionAttributes(fieldPosition3);
			positionAttributes4 = new PositionAttributes(fieldPosition4);
		} catch (InvalidNumber e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testContainsRowColumnOrBox(){
		assertEquals(true, positionAttributes.containsRowBoxOrColumn(positionAttributes2));
		assertEquals(true, positionAttributes.containsRowBoxOrColumn(positionAttributes3));
		assertEquals(true, positionAttributes.containsRowBoxOrColumn(positionAttributes4));
	}
}
