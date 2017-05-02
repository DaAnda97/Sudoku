package org.daanda97.games.sudoku.model;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;
import org.daanda97.games.sudoku.exceptions.InvalidSize;
import org.daanda97.games.sudoku.model.fieldattributes.ColumnNumber;
import org.daanda97.games.sudoku.model.fieldattributes.FieldPosition;
import org.daanda97.games.sudoku.model.fieldattributes.RowNumber;

/**
 * This class contains all Field objects of the Board
 */
public class Fields {
	private Field[] fields;

	public Fields(Field[] fields) throws InvalidSize {
		setFields(fields);
	}

	public Fields() {
		fields = generateEmthyFields();
	}

	/**
	 * 
	 * @return FieldsArray which correctly set PositionAttributes
	 */
	public Field[] generateEmthyFields() {
		Field[] generatedFields = new Field[81];

		FieldPosition[] fieldPositions = new FieldPosition[81];

		try {
			for (int i = 1; i <= 9; i++) {
				ColumnNumber col = new ColumnNumber(i);
				for (int e = 1; e <= 9; e++) {
					RowNumber row = new RowNumber(e);
					fieldPositions[FieldPosition.getFieldNumber(row, col) - 1] = new FieldPosition(row, col);
					
					// Write Field Numbers on Console
//					System.out.print((i < 2 ? (" " + FieldPosition.getFieldNumber(row, col))
//							: FieldPosition.getFieldNumber(row, col)) + "(" + (i) + "," + (e) + ") ");
				}
//				System.out.println();
			}
		} catch (InvalidNumber e) {
			System.out.println("INTERNAL ERROR: " + e.getMessage());
			e.printStackTrace();

		}

		return generatedFields;
	}

	private void setFields(Field[] fields) throws InvalidSize {
		if (fields.length == 81) {
			this.fields = fields;
		} else {
			throw new InvalidSize();
		}
	}

	public static void main(String[] args) {
		Fields fields = new Fields();
	}

}
