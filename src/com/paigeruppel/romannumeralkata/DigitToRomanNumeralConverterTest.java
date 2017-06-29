package com.paigeruppel.romannumeralkata;

import org.junit.Assert;
import org.junit.Test;

public class DigitToRomanNumeralConverterTest {

	@Test
	public void shouldReturnIfrom1() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response =underTest.convertDigitToRomanNumerals(1);
		Assert.assertEquals("I", response);
	}
	
	@Test
	public void shouldReturnVFrom5() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response =underTest.convertDigitToRomanNumerals(5);
		Assert.assertEquals("V", response);
	}
	
	@Test
	public void shouldReturnXFrom10() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response =underTest.convertDigitToRomanNumerals(10);
		Assert.assertEquals("X", response);
	}
	
	@Test
	public void shouldReturnLFrom50() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response =underTest.convertDigitToRomanNumerals(50);
		Assert.assertEquals("L", response);
	}
}
