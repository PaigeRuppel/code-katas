package com.paigeruppel.romannumeralkata;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class DigitToRomanNumeralConverterTakeTwoTest {

	@Test
	public void shouldReturnIFrom1() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(1);
		Assert.assertEquals("I", response);
	}
	
	@Test
	public void shouldReturnIIFrom2() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(2);
		Assert.assertEquals("II", response);
	}
	
	@Test
	public void shouldReturnIIIFrom3() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(3);
		Assert.assertEquals("III", response);
	}
	
	@Test
	public void shouldReturnIVFrom4() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(4);
		Assert.assertEquals("IV", response);
	}
	
	@Test
	public void shouldReturnVFrom5() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(5);
		Assert.assertEquals("V", response);
	}
	
	@Test
	public void shouldReturnVIFrom6() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(6);
		Assert.assertEquals("VI", response);
	}
	
	@Test
	public void shouldReturnVIIFrom7() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(7);
		Assert.assertEquals("VII", response);
	}
	
	@Test
	public void shouldReturnVIIIFrom8() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(8);
		Assert.assertEquals("VIII", response);
	}
	
	@Test
	public void shouldReturnIXFrom9() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(9);
		Assert.assertEquals("IX", response);
	}
	
	@Test
	public void shouldReturnXFrom10() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(10);
		Assert.assertEquals("X", response);
	}
	
	@Test
	public void shouldReturnXXFrom20() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(20);
		Assert.assertEquals("XX", response);
	}
	
	@Test
	public void shouldReturnXXXFrom30() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(30);
		Assert.assertEquals("XXX", response);
	}
	
	@Test
	public void shouldReturnXLFrom40() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(40);
		Assert.assertEquals("XL", response);
	}
	
	@Test
	public void shouldReturnLFrom50() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(50);
		Assert.assertEquals("L", response);
	}
	
	@Test
	public void shouldReturnLXFrom60() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(60);
		Assert.assertEquals("LX", response);
	}
	
	@Test
	public void shouldReturnLXXFrom70() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(70);
		Assert.assertEquals("LXX", response);
	}
	
	@Test
	public void shouldReturnLXXXFrom80() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(80);
		Assert.assertEquals("LXXX", response);
	}
	
	@Test
	public void shouldReturnXCFrom90() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(90);
		Assert.assertEquals("XC", response);
	}
	
	@Test
	public void shouldReturnLIVFrom54() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(54);
		Assert.assertEquals("LIV", response);
	}
	
	@Test 
	public void shouldReturnXLIVFrom44() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(44);
		Assert.assertEquals("XLIV", response);
	}
	
	@Test 
	public void shouldReturnXLIXFrom49() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(49);
		Assert.assertEquals("XLIX", response);
	}
	
	@Test
	public void shouldReturnCFrom100() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(100);
		Assert.assertEquals("C", response);
	}
	
	@Test 
	public void input104ShouldReturnArrayListIndex0Of1() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		ArrayList<Integer> response = underTest.createArrayList(104);
		int index0 = response.get(0);
		Assert.assertEquals(1, index0);	
	}
	
	@Test
	public void shouldReturnMMVIIIFrom2008() {
		DigitToRomanNumeralConverterTakeTwo underTest = new DigitToRomanNumeralConverterTakeTwo();
		String response = underTest.convertToRomanNumeral(2008);
		Assert.assertEquals("MMVIII", response);
	}
	
}
