package com.paigeruppel.romannumeralkata;

public class DigitToRomanNumeralConverterTakeTwo {

	public String convertToRomanNumeral(int input) {
		String answer = "";

		if (input == 1) {
			answer = "I";
		} else if (input == 2) {
			answer = "II";
		}
		return answer;
	}

}
