package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverter {

	public String convertDigitToRomanNumerals(int input) {

		String converted = "";

		for (int j = 6; j >= 0; j--) {
			if (input == number(j)) {
				converted = asString(j);
				break;
			} else if (input % number(j) == 0 && input > number(j)) {
				int factor = input / number(j);
				for (int count = 0; count < factor; count++) {
					converted = asString(j) + converted;
				}
				break;
			} else if (input < number(j) - 1 && input > number(j - 1) + 1) {
				String message = asString(j - 1);
				for (int times = 1; times <= input; times++) {
					converted = converted + message;
				}
				break;
			} else if (input == number(j) + 1) {
				converted = asString(j) + "I";
				break;
			} else if (input == number(j) - 1) {
				converted = asString(0) + asString(j);
				break;
			}
		}

		return converted;
	}

	public String asString(int input) {
		numeralMap();

		return numeralMap().get(basicNumbers()[input]).toString();

	}

	public static Map<Integer, Character> numeralMap() {
		Map<Integer, Character> digitConverter = new HashMap<>();

		digitConverter.put(1, 'I');
		digitConverter.put(5, 'V');
		digitConverter.put(10, 'X');
		digitConverter.put(50, 'L');
		digitConverter.put(100, 'C');
		digitConverter.put(500, 'D');
		digitConverter.put(1000, 'M');

		return digitConverter;
	}

	public static int number(int index) {
		int[] basicNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		return basicNumbers[index];
	}

	public static int[] basicNumbers() {
		int[] basicNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		return basicNumbers;
	}
}
