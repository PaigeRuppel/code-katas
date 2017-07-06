package com.paigeruppel.romannumeralkata;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverterTakeTwo {

	public String convertToRomanNumeral(int input) {
		
		String answer = "";
		int temp = input;
		
		ArrayList<Integer> inputArray = new ArrayList<>();
		do {
			inputArray.add(0, temp % 10);
			temp /= 10;
		} while (temp > 0);
	
		
		if (inputArray.size() == 1) {
			answer = unitsDigit().get(inputArray.get(0));			
		} else if (inputArray.size() == 2) {
			answer = tensDigit().get(inputArray.get(0)) + unitsDigit().get(inputArray.get(1));
		}
		
		return answer;
	}
	
	public static Map<Integer, String> unitsDigit() {
		Map<Integer, String> unitsDigit = new HashMap<>();
		
		unitsDigit.put(0, "");
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
	
	public static Map<Integer, String> tensDigit() {
		Map<Integer, String> tensDigit = new HashMap<>();
		
		tensDigit.put(1, "X");
		tensDigit.put(2, "XX");
//		unitsDigit.put(3, "III");
//		unitsDigit.put(4, "IV");
//		unitsDigit.put(5, "V");
//		unitsDigit.put(6, "VI");
//		unitsDigit.put(7, "VII");
//		unitsDigit.put(8, "VIII");
//		unitsDigit.put(9, "IX");
		
		return tensDigit;
		
	}

}
