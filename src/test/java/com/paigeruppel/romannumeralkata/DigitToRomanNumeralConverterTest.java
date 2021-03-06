package com.paigeruppel.romannumeralkata;

import org.junit.Assert;
import org.junit.Test;

public class DigitToRomanNumeralConverterTest {

	@Test
	public void shouldReturnIfrom1() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(1);
		Assert.assertEquals("I", response);
	}

	@Test
	public void shouldReturnVFrom5() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(5);
		Assert.assertEquals("V", response);
	}

	@Test
	public void shouldReturnXFrom10() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(10);
		Assert.assertEquals("X", response);
	}

	@Test
	public void shouldReturnLFrom50() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(50);
		Assert.assertEquals("L", response);
	}

	@Test
	public void shouldReturnCFrom100() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(100);
		Assert.assertEquals("C", response);
	}

	@Test
	public void shouldReturnDFrom500() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(500);
		Assert.assertEquals("D", response);
	}

	@Test
	public void shouldReturnMFrom1000() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(1000);
		Assert.assertEquals("M", response);
	}

	@Test
	public void shouldReturnIIFrom2() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(2);
		Assert.assertEquals("II", response);
	}

	@Test
	public void shouldReturnIIIFrom3() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(3);
		Assert.assertEquals("III", response);
	}

	@Test
	public void shouldReturnIVFrom4() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(4);
		Assert.assertEquals("IV", response);
	}

	@Test
	public void shouldReturnIXfrom9() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(9);
		Assert.assertEquals("IX", response);
	}

	@Test
	public void shouldReturnVIfrom6() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(6);
		Assert.assertEquals("VI", response);
	}

	@Test
	public void shouldReturnXXfrom20() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(20);
		Assert.assertEquals("XX", response);
	}

	@Test
	public void shouldReturnCCfrom200() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(200);
		Assert.assertEquals("CC", response);
	}

	@Test
	public void shouldReturnXVfrom15() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(15);
		Assert.assertEquals("XV", response);
	}

	@Test
	public void shouldRetutnXXVfrom25() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(25);
		Assert.assertEquals("XXV", response);
	}

	@Test
	public void shouldRetutnXXXVfrom35() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(35);
		Assert.assertEquals("XXXV", response);
	}

	@Test
	public void shouldReturnVLfrom45() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(45);
		Assert.assertEquals("VL", response);
	}

	@Test
	public void shouldReturnLVfrom55() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(55);
		Assert.assertEquals("LV", response);
	}

	@Test
	public void shouldReturnLVIfrom56() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(56);
		Assert.assertEquals("LVI", response);
	}
	
	@Test
	public void shouldReturnCVIfrom106() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(106);
		Assert.assertEquals("CVI", response);
	}
	
	@Test
	public void shouldReturnCLVIfrom156() {
		DigitToRomanNumeralConverter underTest = new DigitToRomanNumeralConverter();
		String response = underTest.convertDigitToRomanNumerals(156);
		Assert.assertEquals("CLVI", response);
	}
	
	
}
