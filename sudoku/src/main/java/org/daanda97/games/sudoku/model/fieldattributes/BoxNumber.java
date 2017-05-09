package org.daanda97.games.sudoku.model.fieldattributes;

import org.daanda97.games.sudoku.exceptions.InvalidNumber;

/**
 * The 3*3 box my field is in
 */
public class BoxNumber extends FieldNumber {

	public BoxNumber(int boxNumber) throws InvalidNumber {
		super(boxNumber);
	}

	/**
	 * 
	 * @param fieldPosition
	 * @return boxNumber; a number between 1 and 9, which represents one of the
	 *         9 3*3 fields
	 */
	public static int getBoxNumber(FieldPosition fieldPosition) {
		int horizontalBoxSection = calculateHorizontalBoxSection(fieldPosition);
		int verticalBoxSection = calculateVerticalBoxSection(fieldPosition);
		int boxNumber = horizontalBoxSection + ((verticalBoxSection - 1) * 3);
		return boxNumber;
	}

	/**
	 * @param fieldPosition
	 * @return The horizontalBoxSection is a number between 1 and 3, which
	 *         represents the horizontal boxes: <br>
	 *         1 = column{1,2,3}; <br>
	 *         2 = column{4,5,6}; <br>
	 *         3 = column{7,8,9}
	 */
	private static int calculateHorizontalBoxSection(FieldPosition fieldPosition) {
		// Number between 1 and 81
		int fieldNumber = fieldPosition.getFieldNumber();
		int columnNumber = fieldNumber % 9; // Number between 0 and 8
		if (columnNumber == 0) { // the result is 0 if the division through 9
									// has
									// no reminder, but should be 9
			columnNumber = 9; // to make sure, that it's in section 3
		}
		// columnNumber + 2: otherwise I would get digits from 0 to 3
		// 1 = column{1,2,3}; 2 = column{4,5,6}; 3 = column{7,8,9}
		int horizontalBoxSection = (int) ((columnNumber + 2) / 3);

		return horizontalBoxSection;
	}

	/**
	 * 
	 * @param fieldPosition
	 * @return The verticalBoxSection is a number between 1 and 3, which
	 *         represents the vertical boxes: <br>
	 *         1 = row{1,2,3}; <br>
	 *         2 = row{4,5,6}; <br>
	 *         3 = row{7,8,9}
	 */
	private static int calculateVerticalBoxSection(FieldPosition fieldPosition) {
		// Number between 1 and 81
		int fieldNumber = fieldPosition.getFieldNumber();
		// The first 27 belong to section 1, the next to 2 and the last one to 3
		// Including 27 --> 27 / 27 = 1, but should be 0 --> fieldNumber - 1
		int verticalBoxSecion = (int) ((fieldNumber-1) / 27) + 1;
		return verticalBoxSecion;
	}
}
