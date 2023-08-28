package com.indrajith.javaCalculator;

import static org.junit.Assert.*;

import org.junit.Test;

public class JavaCalcJUnit {

	@Test
	public void addTest() {
		JavaCalc mycalc = new JavaCalc();
		assertEquals(10,mycalc.addNumbers(5,5));
	}
	
	@Test
	public void subtractTest() {
		JavaCalc mycalc = new JavaCalc();
		assertEquals(5,mycalc.subtractNumbers(10,5));
	}

}
