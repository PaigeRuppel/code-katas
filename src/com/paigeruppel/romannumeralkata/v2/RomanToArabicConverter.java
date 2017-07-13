package com.paigeruppel.romannumeralkata.v2;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {

	public int convertToArabic(String input) {

		char[] inputArrayChar = input.toCharArray();

		int[] rawValues = convertToRawValues(inputArrayChar);

		int answer = 0;

		if (rawValues.length == 1) {
			answer = rawValues[0];
		} else if (rawValues.length != 1) {
			int first = 0;
			answer = rawValues[0];
			for (int next = 1; next < rawValues.length; next++) {
				if (rawValues[next] <= rawValues[first]) {
					answer = answer + rawValues[next];
				} else {
					answer = (answer - rawValues[first]) + (rawValues[next] - rawValues[first]);
				}
				first++;
			}
		}
		return answer;
	}

	private int[] convertToRawValues(char[] inputArrayChar) {
		int[] rawValues = new int[inputArrayChar.length];
		for (int index = 0; index < inputArrayChar.length; index++) {
			rawValues[index] = romanNumeralValues().get(inputArrayChar[index]);
		}
		return rawValues;
	}

	public static Map<Character, Integer> romanNumeralValues() {
		Map<Character, Integer> romanNumerals = new HashMap<>();

		romanNumerals.put('I', 1);
		romanNumerals.put('V', 5);
		romanNumerals.put('X', 10);
		romanNumerals.put('L', 50);
		romanNumerals.put('C', 100);
		romanNumerals.put('D', 500);
		romanNumerals.put('M', 1000);

		return romanNumerals;
	}
}
