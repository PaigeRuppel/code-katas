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

		if (inputArray.length == 1) {
			Character index0Value = inputArray[0];
			switch (index0Value) {
			case 'I':
				converted = numeralValues.get('I');
				break;
			case 'V':
				converted = numeralValues.get('V');
				break;
			case 'X':
				converted = numeralValues.get('X');
				break;
			case 'L':
				converted = numeralValues.get('L');
				break;
			case 'C':
				converted = numeralValues.get('C');
				break;
			case 'D':
				converted = numeralValues.get('D');
				break;
			case 'M':
				converted = numeralValues.get('M');
				break;
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
