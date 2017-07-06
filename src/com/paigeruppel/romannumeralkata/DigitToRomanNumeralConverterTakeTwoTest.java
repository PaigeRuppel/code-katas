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
	
	@Test
	public void shouldReturnVfrom5() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(5);
		Assert.assertEquals("V", response);
	}
	
	@Test
	public void shouldReturnVIfrom6() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(6);
		Assert.assertEquals("VI", response);
	}
	
	@Test
	public void shouldReturnVIIfrom7() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(7);
		Assert.assertEquals("VII", response);
	}
	
	@Test
	public void shouldReturnVIIIfrom8() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(8);
		Assert.assertEquals("VIII", response);
	}
	
	@Test
	public void shouldReturnIXfrom9() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(9);
		Assert.assertEquals("IX", response);
	}
	
	@Test
	public void shouldReturnXfrom10() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(10);
		Assert.assertEquals("X", response);
	}
	
}
