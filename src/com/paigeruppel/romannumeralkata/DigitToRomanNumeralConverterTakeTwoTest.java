package com.paigeruppel.romannumeralkata;

import org.junit.Assert;
import org.junit.Test;

public class DigitToRomanNumeralConverterTakeTwoTest {

	@Test
	public void shouldReturnIfrom1() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(1);
		Assert.assertEquals("I", response);
	}
	
}
