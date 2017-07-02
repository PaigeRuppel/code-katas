package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverter {

	public String convertDigitToRomanNumerals(int input) {

		String converted = "";

		Map<Integer, Character> digitConverter = new HashMap<>();

		digitConverter.put(1, 'I');
		digitConverter.put(5, 'V');
		digitConverter.put(10, 'X');
		digitConverter.put(50, 'L');
		digitConverter.put(100, 'C');
		digitConverter.put(500, 'D');
		digitConverter.put(1000, 'M');

		int[] basicNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		int j = 1;

		do {
			if (input < basicNumbers[j] - 1) {
				String message = digitConverter.get(basicNumbers[j - 1]).toString();
				for (int times = 1; times <= input; times++) {
					converted = converted + message;
				}
				break;
			} else if (input == basicNumbers[j] - 1) {
				converted = digitConverter.get(basicNumbers[0]).toString()
						+ digitConverter.get(basicNumbers[j]).toString();
				break;
			} else if (input == basicNumbers[j] + 1) {
				converted = digitConverter.get(basicNumbers[j]).toString()
						+ digitConverter.get(basicNumbers[0]).toString();
				break;
			}
			j++;
		} while (j < basicNumbers.length);

		for (int i = 0; i < basicNumbers.length; i++) {
			if (input == basicNumbers[i]) {
				converted = digitConverter.get(basicNumbers[i]).toString();
				break;
			}
		}
		return converted;
	}
}
