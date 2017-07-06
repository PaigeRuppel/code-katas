package com.paigeruppel.romannumeralkata.v2;

import org.junit.Assert;
import org.junit.Test;

public class RomanToArabicConverterTest {

	@Test
	public void shouldReturn1() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("I");
		Assert.assertEquals(1, response);
	}
	
	@Test
	public void shouldReturn2() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("II");
		Assert.assertEquals(2, response);
	}
	
	@Test
	public void shouldReturn3() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("III");
		Assert.assertEquals(3, response);
	}
	
	@Test
	public void shouldReturn4() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("IV");
		Assert.assertEquals(4, response);
	}
	
}
