package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverter {

	public String convertDigitToRomanNumerals(int input) {

		String converted = "";

		// split to array?

		String temp = Integer.toString(input);

		int[] inputArray = new int[temp.length()];

		
		for (int j = 6; j >= 0; j--) {
			if (input == number(j)) {
				converted = asString(j);
				break;
			} else if (input % number(j) == 0) {
				int factor = input / number(j);
				for (int count = 1; count <= factor; count++) {
					converted = converted + asString(j);
				}
				break;
			} else if (input % number(j) == 5) {
				if (input + 5 == number(j + 1)) {
					converted = "V" + asString(j + 1);
					break;
				} else {
					int factor = (input - 5) / number(j);
					for (int count = 1; count <= factor; count++) {
						converted = converted + asString(j);
					}
					converted = converted + "V";
				}
				break;
			} else if (input == number(j) + 6) {
				converted = asString(j) + "VI";
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
		int[] basicNumbers = { 1, 5, 10, 50, 100, 500, 1000, 0 };

		return basicNumbers[index];
	}

	public static int[] basicNumbers() {
		int[] basicNumbers = { 1, 5, 10, 50, 100, 500, 1000 };

		return basicNumbers;
	}
}
