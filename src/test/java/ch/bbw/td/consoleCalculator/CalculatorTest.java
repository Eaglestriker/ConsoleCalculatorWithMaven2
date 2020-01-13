package ch.bbw.td.consoleCalculator;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

import ch.bbw.td.consolecalculator.Calculator;

public class CalculatorTest {
	Calculator testee;

	@Test
	public void testSummeZweiPositiveIsOk() {
		testee = new Calculator();
		assertTrue(testee.summe(10, 25) == 35);
	}

}
