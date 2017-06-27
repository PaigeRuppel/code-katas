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
			converted = 5;
		}

		if (input.equals("X")) {
			converted = 10;
		}
		if (input.equals("L")) {
			converted = 50;
		}

		if (input.equals("C")) {
			converted = 100;
		}
		return converted;
	}
	
//	public Map<Character, Integer> numeralList() {
//		Map<Character, Integer> numeralValues = new HashMap<>();
//		numeralValues.put('I', 1);
//		numeralValues.put('V', 5);
//		numeralValues.put('X', 10);
//		numeralValues.put('L', 50);
//		numeralValues.put('C', 100);
//		numeralValues.put('D', 500);
//		numeralValues.put('M', 1000);
//		return numeralValues;
//	}

}
