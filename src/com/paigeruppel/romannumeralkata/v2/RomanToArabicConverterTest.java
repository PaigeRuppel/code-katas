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
}
