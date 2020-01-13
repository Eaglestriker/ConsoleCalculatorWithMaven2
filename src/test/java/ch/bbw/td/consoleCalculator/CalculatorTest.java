package ch.bbw.td.consoleCalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import ch.bbw.td.consolecalculator.Calculator;

public class CalculatorTest {
	Calculator testee;
	

	
	//Testerstellung für eine + Rechnung mit 2 positiven zahlen
	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	//Testerstellung für eine - Rechnung mit zwei positiven Zahlen
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.subtraktion(25, 10) == 15);
	}

}
