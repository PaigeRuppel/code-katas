package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverterTakeTwo {

	public String convertToRomanNumeral(int input) {
		String answer = unitsDigit().get(input);
		
		return answer;
	}
	
	public static Map<Integer, String> unitsDigit() {
		Map<Integer, String> unitsDigit = new HashMap<>();
		
		unitsDigit.put(1, "I");
		unitsDigit.put(2, "II");
		unitsDigit.put(3, "III");
		unitsDigit.put(4, "IV");
		unitsDigit.put(5, "V");
		unitsDigit.put(6, "VI");
		unitsDigit.put(7, "VII");
		unitsDigit.put(8, "VIII");
		unitsDigit.put(9, "IX");
		
		return unitsDigit;
		
	}

}
