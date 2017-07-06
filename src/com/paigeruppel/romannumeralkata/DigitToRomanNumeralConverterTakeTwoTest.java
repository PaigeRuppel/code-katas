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
	
	@Test
	public void shouldReturnIIfrom2() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(2);
		Assert.assertEquals("II", response);
	}
	
	@Test
	public void shouldReturnIIIfrom3() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(3);
		Assert.assertEquals("III", response);
	}
	
	@Test
	public void shouldReturnIVfrom4() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(4);
		Assert.assertEquals("IV", response);
	}
	
}
