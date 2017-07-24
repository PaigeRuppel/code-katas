package com.paigeruppel.primefactors;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PrimeFactorsTest {

	// prime factor defined as anything bigger than one divisible only by itself
	@Test
	public void oneHasNoPrimeFactors() {
		assertEquals(asList(), PrimeFactors.computePrimeFactors(1));
	}

	@Test
	public void twoHasOnlyItselfAsPrimeFactor() {
		assertEquals(asList(2), PrimeFactors.computePrimeFactors(2));
	}

	@Test
	public void threeHasOnlyItselfAsAPrimeFactor() {
		assertEquals(asList(3), PrimeFactors.computePrimeFactors(3));
	}

	@Test
	public void fourHasTwoTimesTwoAsPrimeFactors() {
		assertEquals(asList(2, 2), PrimeFactors.computePrimeFactors(4));
	}

	@Test
	public void fiveHasOnlyItselfAsPrimeFactor() {
		assertEquals(asList(5), PrimeFactors.computePrimeFactors(5));
	}

	@Test
	public void sixHasTwoAndThreeAsPrimeFactors() {
		assertEquals(asList(2, 3), PrimeFactors.computePrimeFactors(6));
	}

	@Test
	public void eightHasThreeTwosAsPrimeFactors() {
		assertEquals(asList(2, 2, 2), PrimeFactors.computePrimeFactors(8));
	}

	@Test
	public void nineHasTwoThreesAsPrimeFactors() {
		assertEquals(asList(3, 3), PrimeFactors.computePrimeFactors(9));
	}

	@Test
	public void tenHasTwoAndFiveAsPrimeFactors() {
		assertEquals(asList(2, 5), PrimeFactors.computePrimeFactors(10));
	}

	@Test
	public void elevenHasItselfAsPrimeFactor() {
		assertEquals(asList(11), PrimeFactors.computePrimeFactors(11));
	}
}
