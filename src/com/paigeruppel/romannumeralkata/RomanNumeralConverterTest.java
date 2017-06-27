package com.paigeruppel.romannumeralkata;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralConverterTest {

	@Test 
	public void shouldReturn1FromI() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("I");
		//assert
		Assert.assertEquals(1, response);
	}
	
	@Test
	public void shouldReturn5FromV() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("V");
		//assert
		Assert.assertEquals(5, response);
	}
	
	@Test
	public void shouldReturn10FromX() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("X");
		//assert
		Assert.assertEquals(10, response);
	}
	
	@Test
	public void shouldReturn50FromL() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("L");
		//assert
		Assert.assertEquals(50, response);
	}
	
	@Test
	public void shouldReturn100FromC() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("C");
		//assert
		Assert.assertEquals(100, response);
	}
	
	@Test
	public void shouldReturn500FromD() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("D");
		//assert
		Assert.assertEquals(500, response);
	}
	
	@Test
	public void shouldReturn1000FromM() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertSingleCharacterToDigit("M");
		//assert
		Assert.assertEquals(1000, response);
	}
	
	@Test 
	public void shouldReturn1FromIWithRefactoredMultiMethod() {
		//arrange
		RomanNumeralConverter underTest = new RomanNumeralConverter();
		//act
		int response = underTest.convertMultiCharacterToDigit("I");
		//assert
		Assert.assertEquals(1, response);
	}
	
//	@Test
//	public void shouldReturn2FromII() {
//		//arrange
//		RomanNumeralConverter underTest = new RomanNumeralConverter();
//		//act
//		int response = underTest.convertMultiCharacterToDigit("II");
//		//assert
//		Assert.assertEquals(2, response);
//	}
	
}
