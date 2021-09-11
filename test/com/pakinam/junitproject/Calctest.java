package com.pakinam.junitproject;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Calctest {

	@Test
	void calctest() {
		assertEquals("error in add()", 3, Calculator.add(1, 2));
		assertEquals("error in sub()", -1, Calculator.sub(1, 2));
		assertEquals("error in mul()", 2, Calculator.mul(1, 2));
		
		assertEquals("error in div()", 1, Calculator.div(2, 2));
		
	}

}
