package com.paigeruppel.romannumeralkata;

public class DigitToRomanNumeralConverterTakeTwo {

	public String convertToRomanNumeral(int input) {
		String answer = "";

		if (input == 1) {
			answer = "I";
		} else if (input == 2) {
			answer = "II";
		} else if (input == 3) {
			answer = "III";
		} else if (input == 4) {
			answer = "IV";
		} else if (input == 5) {
			answer = "V";
		} else if (input == 6) {
			answer = "VI";
		} else if (input == 7) {
			answer = "VII";
		} else if (input == 8) {
			answer = "VIII";
		} else if (input == 9) {
			answer = "IX";
		}
		return answer;
	}

}
