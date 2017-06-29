package com.paigeruppel.romannumeralkata;

import java.util.HashMap;
import java.util.Map;

public class DigitToRomanNumeralConverter {

	public String convertDigitToRomanNumerals(int i) {
		
		Map<Integer, Character> digitConverter = new HashMap<>();
		
		digitConverter.put(1, 'I');
		digitConverter.put(5, 'V');
		digitConverter.put(10, 'X');
		digitConverter.put(50, 'L');
		digitConverter.put(100, 'C');
		digitConverter.put(500, 'D');
		digitConverter.put(1000, 'M');
		
		return digitConverter.get(i).toString();
	}

}
