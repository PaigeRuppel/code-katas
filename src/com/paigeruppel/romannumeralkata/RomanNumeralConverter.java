package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class RomanNumeralConverter {

	public int convertSingleCharacterToDigit(String input) {
		int converted = 0;
		char[] inputArray = input.toCharArray();
		Map<Character, Integer> numeralValues = new HashMap<>();
		numeralValues.put('I', 1);
		numeralValues.put('V', 5);
		numeralValues.put('X', 10);
		numeralValues.put('L', 50);
		numeralValues.put('C', 100);
		numeralValues.put('D', 500);
		numeralValues.put('M', 1000);

		Character indexValue = inputArray[0];
		if (input.equals("I")) {
			converted = numeralValues.get('I');
		}

		if (input.equals("V")) {
			converted = numeralValues.get('V');
		}

		if (input.equals("X")) {
			converted = numeralValues.get('X');
		}
		if (input.equals("L")) {
			converted = numeralValues.get('L');
		}

		if (input.equals("C")) {
			converted = numeralValues.get('C');
		}

		if (input.equals("D")) {
			converted = numeralValues.get('D');
		}

		if (input.equals("M")) {
			converted = numeralValues.get('M');
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
