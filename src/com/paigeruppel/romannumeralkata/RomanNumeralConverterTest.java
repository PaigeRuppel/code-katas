package com.paigeruppel.romannumeralkata;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test 
	public void shouldReturn1FromI() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("I");
		//assert
		Assert.assertEquals(1, response);
	}
	
	@Test
	public void shouldReturn5FromV() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("V");
		//assert
		Assert.assertEquals(5, response);
	}
	
	@Test
	public void shouldReturn10FromX() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("X");
		//assert
		Assert.assertEquals(10, response);
	}
	
	@Test
	public void shouldReturn50FromL() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("L");
		//assert
		Assert.assertEquals(50, response);
	}
	
	@Test
	public void shouldReturn100FromC() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("C");
		//assert
		Assert.assertEquals(100, response);
	}
	
	@Test
	public void shouldReturn500FromD() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("D");
		//assert
		Assert.assertEquals(500, response);
	}
	
	@Test
	public void shouldReturn1000FromM() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("M");
		//assert
		Assert.assertEquals(1000, response);
	}
	
	
	@Test
	public void shouldReturn2FromII() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("II");
		//assert
		Assert.assertEquals(2, response);
	}
	
	@Test
	public void shouldReturn3FromIII() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertRomanNumeralsToDigit("III");
		//assert
		Assert.assertEquals(3, response);
	}
	
	@Test
	public void shouldReturn20FromXX() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("XX");
		Assert.assertEquals(20, response);
	}
	
	@Test 
	public void shouldReturn4FromIV() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("IV");
		Assert.assertEquals(4, response);
	}
	
	@Test
	public void shouldReturn14FromXIV() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("XIV");
		Assert.assertEquals(14, response);
	}
	
	@Test
	public void shouldReturn24FromXXIV() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("XXIV");
		Assert.assertEquals(24, response);
	}
	
	@Test
	public void shouldReturn44FromXLIV() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("XLIV");
		Assert.assertEquals(44, response);
	}
	
	@Test
	public void shouldReturn144FromCXLIV() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("CXLIV");
		Assert.assertEquals(144, response);
	}
	
	@Test
	public void shouldReturn448FromCDXLVIII() {
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		int response = underTest.convertRomanNumeralsToDigit("CDXLVIII");
		Assert.assertEquals(448, response);
	}
	
	
	
}
