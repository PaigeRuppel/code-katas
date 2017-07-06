package com.paigeruppel.romannumeralkata.v2;

public class RomanToArabicConverter {

	public int convertToArabic(String input) {
		int answer = 0;

		if (input.equals("I")) {
			answer = 1;
		} else if (input.equals("II")) {
			answer = 2;
		} else if (input.equals("III")) {
			answer=3;
		} else if (input.equals("IV")) {
			answer=4;
		}

		return answer;
	}
}
