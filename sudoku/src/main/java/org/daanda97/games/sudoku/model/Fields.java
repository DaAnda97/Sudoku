package org.daanda97.games.sudoku.model;

import java.util.ArrayList;
import java.util.List;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber;
import org.daanda97.games.sudoku.model.fieldattributes.FieldCoordinate;
import org.daanda97.games.sudoku.model.fieldattributes.PositionAttributes;
import org.daanda97.games.sudoku.model.fieldattributes.RowNumber;

/**
 * This class contains all Field objects of the Board
 */
public class Fields {
	private List<Field> fields;

	public Fields() throws InvalidNumber {
		fields = generateEmthyFields();
	}

	/**
	 * 
	 * @return FieldsArray which correctly set PositionAttributes: <br>
	 *         FieldNumber = Field[i - 1] -> f.ex.: Field with number 24 is in
	 *         Field[23]
	 * @throws InvalidNumber
	 */
	private List<Field> generateEmthyFields() throws InvalidNumber {
		ArrayList<Field> generatedFields = new ArrayList<Field>();
		System.out.println("Generated Fields: FieldPosition (column,row) [box]");
		for (int i = 1; i <= 9; i++) {
			RowNumber row = new RowNumber(i);
			for (int e = 1; e <= 9; e++) {
				ColumnNumber col = new ColumnNumber(e);
				FieldCoordinate fieldPosition = new FieldCoordinate(row, col);
				PositionAttributes positionAttributes = new PositionAttributes(fieldPosition);
				generatedFields.add(new Field(positionAttributes));
				
				System.out.print(((i == 1) ? " " : "") + positionAttributes.toString() + " ");
			}
			System.out.println();
		}
		return generatedFields;
	}

}
