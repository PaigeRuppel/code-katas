package com.paigeruppel.romannumeralkata.v2;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {

	public int convertToArabic(String input) {
		int answer = 0;

		char[] inputArray = input.toCharArray();
		
		if (inputArray.length == 1) {
			answer = romanNumeralValues().get(inputArray[0]);
		}	else {
			for (int i = 0; i < inputArray.length; i++) {
				answer = answer + romanNumeralValues().get(inputArray[i]);
			}
		}

		return answer;
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
