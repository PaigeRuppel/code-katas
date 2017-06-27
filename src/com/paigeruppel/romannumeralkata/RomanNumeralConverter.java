package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumeralConverter {

	public int convertRomanNumeralsToDigit(String input) {

		int converted = 0;
		char[] inputArray = input.toCharArray();

		int[] rawValues = new int[inputArray.length];

		Map<Character, Integer> numeralValues = new HashMap<>();
		numeralValues.put('I', 1);
		numeralValues.put('V', 5);
		numeralValues.put('X', 10);
		numeralValues.put('L', 50);
		numeralValues.put('C', 100);
		numeralValues.put('D', 500);
		numeralValues.put('M', 1000);

		for (int i = 0; i < inputArray.length; i++) {
			rawValues[i] = numeralValues.get(inputArray[i]);
		}
		if (rawValues.length == 1) {
			converted = rawValues[0];
		} else {
			for (int after = 1; after < rawValues.length; after++) {
				int before = 0;
				int sum = rawValues[0];
				if (rawValues[after] <= rawValues[before]) {
					sum = sum + rawValues[after];
					converted = sum;
				}
			}
		}
		return converted;

	}

	// public Map<Character, Integer> numeralList() {
	// Map<Character, Integer> numeralValues = new HashMap<>();
	// numeralValues.put('I', 1);
	// numeralValues.put('V', 5);
	// numeralValues.put('X', 10);
	// numeralValues.put('L', 50);
	// numeralValues.put('C', 100);
	// numeralValues.put('D', 500);
	// numeralValues.put('M', 1000);
	// return numeralValues;
	// }

}
