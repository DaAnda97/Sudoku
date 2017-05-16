package org.daanda97.games.sudoku.model.fieldattributes;

import static org.junit.Assert.assertEquals;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.junit.Before;
import org.junit.Test;

public class TestPositionAttributes {
	PositionAttributes positionAttributes;
	PositionAttributes positionSameColumn;
	PositionAttributes positionSameRow;
	PositionAttributes positionSameBox;
	PositionAttributes positionNothingSame;
	
	@Before
	public void initialize(){
		try {
			FieldCoordinate fieldPosition = new FieldCoordinate(new RowNumber(3), new ColumnNumber(5));
			FieldCoordinate sameColumn = new FieldCoordinate(new RowNumber(7), new ColumnNumber(5)); 
			FieldCoordinate sameRow = new FieldCoordinate(new RowNumber(3), new ColumnNumber(1)); 
			FieldCoordinate sameBox = new FieldCoordinate(new RowNumber(2), new ColumnNumber(4));
			FieldCoordinate nothingSame = new FieldCoordinate(new RowNumber(9), new ColumnNumber(9));
			
			positionAttributes = new PositionAttributes(fieldPosition);
			positionSameColumn = new PositionAttributes(sameColumn);
			positionSameRow = new PositionAttributes(sameRow);
			positionSameBox = new PositionAttributes(sameBox);
			positionNothingSame = new PositionAttributes(nothingSame);
			
		} catch (InvalidNumber e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void testContainsRowColumnOrBox(){
		assertEquals(true, positionAttributes.containsRowColumnOrBox(positionSameColumn));
		assertEquals(true, positionAttributes.containsRowColumnOrBox(positionSameRow));
		assertEquals(true, positionAttributes.containsRowColumnOrBox(positionSameBox));
		assertEquals(false, positionAttributes.containsRowColumnOrBox(positionNothingSame));
	}
}
