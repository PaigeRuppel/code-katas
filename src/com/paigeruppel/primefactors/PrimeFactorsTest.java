package com.paigeruppel.primefactors;

import static org.junit.Assert.*;

import java.util.Collections;

import org.junit.Test;

public class PrimeFactorsTest {

	@Test
	public void oneHasNotPrimeFactor() {
		assertEquals(Collections.emptyList(), PrimeFactors.computeFactorsFor(1));
	}
}
