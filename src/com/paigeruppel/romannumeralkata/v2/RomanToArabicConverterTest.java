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
	

//	@Test
//	public void shouldReturn4() {
//		RomanToArabicConverter underTest = new RomanToArabicConverter();
//		int response = underTest.convertToArabic("IV");
//		Assert.assertEquals(4, response);
//	}
	
	@Test
	public void shouldReturn5() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("V");
		Assert.assertEquals(5,  response);
	}

	@Test
	public void shouldReturn10() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("X");
		Assert.assertEquals(10,  response);
	}
	
	@Test
	public void shouldReturn50() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("L");
		Assert.assertEquals(50,  response);
	}
	
	@Test
	public void shouldReturn100() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("C");
		Assert.assertEquals(100,  response);
	}
	
	@Test
	public void shouldReturn500() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("D");
		Assert.assertEquals(500,  response);
	}
	
	@Test
	public void shouldReturn1000() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("M");
		Assert.assertEquals(1000,  response);
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
	public void shouldReturn30() {
		RomanToArabicConverter underTest = new RomanToArabicConverter();
		int response = underTest.convertToArabic("XXX");
		Assert.assertEquals(30, response);
	}
	
	

}
