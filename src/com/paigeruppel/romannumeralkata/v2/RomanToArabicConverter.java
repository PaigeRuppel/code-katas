package com.paigeruppel.romannumeralkata.v2;

import java.util.HashMap;
import java.util.Map;

public class RomanToArabicConverter {

	public int convertToArabic(String input) {
		

		char[] inputArray = input.toCharArray();
		
		int answer =  romanNumeralValues().get(inputArray[0]);
		
		if (inputArray.length > 1) {
			int before = 0;
			for (int next = 1; next < inputArray.length; next++) {
				answer = answer + romanNumeralValues().get(inputArray[next]);
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
