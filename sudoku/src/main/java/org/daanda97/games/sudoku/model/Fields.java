package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber;
import org.daanda97.games.sudoku.model.fieldattributes.FieldPosition;
import org.daanda97.games.sudoku.model.fieldattributes.PositionAttributes;
import org.daanda97.games.sudoku.model.fieldattributes.RowNumber;

/**
 * This class contains all Field objects of the Board
 */
public class Fields {
	private Field[] fields;

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
	public Field[] generateEmthyFields() throws InvalidNumber {
		Field[] generatedFields = new Field[81];

		for (int i = 1; i <= 9; i++) {
			RowNumber row = new RowNumber(i);
			for (int e = 1; e <= 9; e++) {
				ColumnNumber col = new ColumnNumber(e);
				FieldPosition fieldPosition = new FieldPosition(row, col);
				PositionAttributes positionAttributes = new PositionAttributes(fieldPosition);
				generatedFields[i + (e - 1) * 9] = new Field(positionAttributes);
				
				System.out.print(positionAttributes.toString() + " ");
			}
			System.out.println();
		}
		return generatedFields;
	}


	public static void main(String[] args) {
		try {
			Fields fields = new Fields();
		} catch (InvalidNumber e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
