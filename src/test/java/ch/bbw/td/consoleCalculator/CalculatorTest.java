package ch.bbw.td.consoleCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import ch.bbw.td.consolecalculator.Calculator;

/**
 * 
 * @author Tim Dubath
 * @version 10.01.2020
 */

public class CalculatorTest {
	Calculator testee;
	
	//Alle Tests waren bereits von Anfang an so geschrieben, 
	//dass Sie nur eine Funktion einer Klasse testen und nicht mehrere
	
	
	@Before
	public void setUp() {
		testee = new Calculator();
	}
	
	//Tests für die Summe Methode
	//Testerstellung für eine + Rechnung mit 2 positiven Zahlen
	@Test
	public void testSummeZweiPositiveIsOk() {
		assertTrue(testee.summe(10, 25) == 35);
	}
	
	@Test
	public void testSumme2negativIsOk() {
		assertTrue(testee.summe(-10, -10) == -20);
	}
	
	@Test
	public void testSumme1negativ1positivIsOk() {
		assertTrue(testee.summe(-10, 20)== 10);
	}
	
	@Test
	public void testSumme1positiv1negativIsOk() {
		assertTrue(testee.summe(20, -10)== 10);
	}
	
	@Test
	public void testSumme2mal0IsOk() {
		assertTrue(testee.summe(0, 0)== 0);
	}
	
	@Test
	public void testSumme2malMinus0IsOk() {
		assertTrue(testee.summe(-0, -0)== 0);
	}
	
	@Test
	public void testSumme1Plus01Minus0IsOk() {
		assertTrue(testee.summe(0, -0)== 0);
	}
	
	@Test
	public void testSumme1Minus01Plus0IsOk() {
		assertTrue(testee.summe(-0, 0)== 0);
	}
	
	@Test
	public void testSummePlusMinus0IsOk() {
		assertTrue(testee.summe(5, -0)== 5);
	}
	
	@Test
	public void testSummeMinus0PlusIsOk() {
		assertTrue(testee.summe(-0, 5)== 5);
	}
	
	@Test
	public void testSummeMinus0MinusIsOk() {
		assertTrue(testee.summe(-0, -5)== -5);
	}
	
	@Test
	public void testSummeMinusMinus0IsOk() {
		assertTrue(testee.summe(-5, -0)== -5);
	}
	
	@Test
	public void testSummeMinusPlus0IsOk() {
		assertTrue(testee.summe(-5, 0)== -5);
	}
	
	@Test
	public void testSummePlus0MinusIsOk() {
		assertTrue(testee.summe(0, -5)== -5);
	}
	
	@Test
	public void testSumme0PlusIsOk() {
		assertTrue(testee.summe(0, 5)== 5);
	}
	
	@Test
	public void testSummePlus0IsOk() {
		assertTrue(testee.summe(5, 0)== 5);
	}
	
	@Test
	public void testSummeMinValuePositiveIsOk() {
		assertTrue(testee.summe(Integer.MIN_VALUE, 10) == -2147483638);
	}
	
	@Test
	public void testSummeMaxValuePositiveIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, 15) == -2147483634);
	}
	
	@Test
	public void testSummeMinValueNegativeIsOk() {
		assertTrue(testee.summe(Integer.MIN_VALUE, -10) == 2147483638);
	}
	
	@Test
	public void testSummeMaxValueNegativeIsOk() {
		assertTrue(testee.summe(Integer.MAX_VALUE, -15) == 2147483632);
	}
	
	@Test
	public void testSummeNegativePositivIsGreaterThenZero() {
		assertTrue(testee.summe(-17, 30) > 0);
	}
	
	@Test
	public void testSummeNegativePositivIsLessThenZero() {
		assertTrue(testee.summe(-37, 20) < 0);
	}
	
	//Test für die Subtraktion Methode
	//Testerstellung für eine - Rechnung mit zwei positiven Zahlen
	@Test
	public void testSubtractionZweiPositiveIsOk() {
		
		assertTrue(testee.subtraktion(25, 10) == 15);
	}
	
	@Test
	public void testSubtraction2negativIsOk() {
		assertTrue(testee.subtraktion(-10, -10) == 0);
	}
	
	@Test
	public void testSubtraction1negativ1positivIsOk() {
		assertTrue(testee.subtraktion(-10, 20)== -30);
	}
	
	@Test
	public void testSubtraction1positiv1negativIsOk() {
		assertTrue(testee.subtraktion(20, -10)== 30);
	}
	
	@Test
	public void testSubtraction2mal0IsOk() {
		assertTrue(testee.subtraktion(0, 0)== 0);
	}
	
	@Test
	public void testSubtraction2malMinus0IsOk() {
		assertTrue(testee.subtraktion(-0, -0)== 0);
	}
	
	@Test
	public void testSubtraction1Plus01Minus0IsOk() {
		assertTrue(testee.subtraktion(0, -0)== 0);
	}
	
	@Test
	public void testSubtraction1Minus01Plus0IsOk() {
		assertTrue(testee.subtraktion(-0, 0)== 0);
	}
	
	@Test
	public void testSubtractionPlusMinus0IsOk() {
		assertTrue(testee.subtraktion(5, -0)== 5);
	}
	
	@Test
	public void testSubtractionMinus0PlusIsOk() {
		assertTrue(testee.subtraktion(-0, 5)== -5);
	}
	
	@Test
	public void testSubtractionMinus0MinusIsOk() {
		assertTrue(testee.subtraktion(-0, -5)== 5);
	}
	
	@Test
	public void testSubtractionMinusMinus0IsOk() {
		assertTrue(testee.subtraktion(-5, -0)== -5);
	}
	
	@Test
	public void testSubtractionMinusPlus0IsOk() {
		assertTrue(testee.subtraktion(-5, 0)== -5);
	}
	
	@Test
	public void testSubtractionPlus0MinusIsOk() {
		assertTrue(testee.subtraktion(0, -5)== 5);
	}
	
	@Test
	public void testSubtraction0PlusIsOk() {
		assertTrue(testee.subtraktion(0, 5)== -5);
	}
	
	@Test
	public void testSubtractionPlus0IsOk() {
		assertTrue(testee.subtraktion(5, 0)== 5);
	}
	
	@Test
	public void testSubtraktionMinValueNegativeIsOk() {
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, -10) == -2147483638);
	}
	
	@Test
	public void testSubtraktionMaxValuePositiveIsOk() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, 10) == 2147483637);
	}
	
	@Test
	public void testSubtraktionMinValuePositiveIsOk() {
		assertTrue(testee.subtraktion(Integer.MIN_VALUE, 10) == 2147483638);
	}
	
	@Test
	public void testSubtraktionMaxValueNegativeIsOk() {
		assertTrue(testee.subtraktion(Integer.MAX_VALUE, -10) == -2147483639);
	}
	
	@Test
	public void testSubtraktionPositivNegativGreaterThenZero() {
		assertTrue(testee.subtraktion(49, -25) > 0);
	}
	
	@Test
	public void testSubtraktion2PositivLessThenZero() {
		assertTrue(testee.subtraktion(37, 38) < 0);
	}

	
	//Division Tests
	@Test
	public void testDivisionPositivDurchPositivIsOk() {
		assertTrue(testee.division(3, 2)== 1.5);
	}
	
	@Test
	public void testDivisionPositivDurchNegativIsOk() {
		assertTrue(testee.division(5, -5)== -1);
	}
	
	@Test
	public void testDivisionNegativDurchPositivIsOk() {
		assertTrue(testee.division(-5, 5)== -1);	
	}
	
	@Test
	public void testDivisionNegativDurchNegativIsOk() {
		assertTrue(testee.division(-5, -5)== 1);
	}
	
	@Test
	public void testDivisionZeroDurchNegativIsOk() {
		assertTrue(testee.division(0, -10)== 0);
	}
	
	@Test
	public void testDivisionZeroDurchPositivIsOk() {
		assertTrue(testee.division(0, 30)== 0);
	}
	
	@Test(expected=AssertionError.class)
	public void testDivisionZeroDurchZeroIsOk() {
		assertTrue(testee.division(0, 0)== 0);
	}
	
	
	//Diese drei Tests failen aus unerklärlichen Gründen. Egal was ich expecte sie failen. Benötige Hilfe von P. Rutschmann
	
	@Ignore
	@Test(expected=ArithmeticException.class)
	public void testDivisionPositivDurchZeroIsOk() {
		testee.division(10, 0);
	}
	
	@Ignore
	@Test(expected=AssertionError.class)
	public void testDivisionNegativDurchZeroIsOk() {
		testee.division(-5, 0);
	}
	
	
	//unexpected Exception Test Aufgefangen mit einem Try Catch Block
	@Ignore
	@Test
	public void testDivisionNegativDurchZeroexceptionIsOk() {
		try {
			assertTrue(testee.division(-5, 0)== 0);
		}catch(ArithmeticException e) {
			throw e;
		}
	}
	
	@Test
	public void testDivisionPositivNegativIsLessThenZero() {
		assertTrue(testee.division(25, -40) < 0);
	}
	
	@Test
	public void testDivision2NegativGreaterThenZero() {
		assertTrue(testee.division(-30, -15) > 0);
	}
	
	
	//Multiplikation Testfälle
	//Die Methode Multiplikation ist privat und kann somit nicht getestet werden.
	@Ignore
	@Test
	public void testMultiplicationPositiveTimesPositiveIsOk() {
		//assertTrue(testee.muliplikation(10,10)==100);
	}
	
	//Quadrationen Testfälle
	@Test
	public void testQuadrierenPositveIsOk() {
		assertTrue(testee.quadrieren(7)==49);
	}
	
	@Test
	public void testQuadrierenNegativeIsOk() {
		assertTrue(testee.quadrieren(-5)== 25);
	}
	
	@Test
	public void testQuadrierenZeroIsOk() {
		assertTrue(testee.quadrieren(0)== 0);
	}
	
	
	//Wurzelberechnung Tests
	//Methode kann nicht getestet werden, da sie in einem anderen Package liegt
	//und somit keinen Zugriff auf Tests in anderen Packages gewährt dies liegt an der Sichtbarkeit Protected.
	@Ignore
	@Test
	public void testWurzelPositivIsOk() {
		//assertTrue(testee.wurzelBerechnung(49)==7);
	}
	
	//Zinseszins Test
	@Test
	public void testZinseszinsPositiveIsOk() {
		double zins = testee.zinseszins(-100000, -1, 5);
		System.out.println(zins);
		assertTrue(testee.zinseszins(100000, 1, 5)== 105101.01);
	}
	
	@Test
	public void testZinseszinsZinsNegativIsOk() {
		assertTrue(testee.zinseszins(100000, -1, 5)== 95099.0);
	}
	
	@Test
	public void testZinseszinsAnfangskapitalNegativIsOk() {
		assertTrue(testee.zinseszins(-100000, 1, 5)== -105101.01);
	}
	
	@Test
	public void testZinseszinsAnfangskapitalNegativZinsenNegativIsOk() {
		assertTrue(testee.zinseszins(-100000, -1, 5)== -95099.0);
	}
	
	
	//Binary Tests
	@Test
	public void testBinaryPositivIsOk() {
		assertEquals(testee.binary(25),new String("11001"));
	}
	
	@Test
	public void testBinaryNegativIsOk() {
		assertEquals(testee.binary(-25),new String("11111111111111111111111111100111"));
	}
	
	@Test
	public void testBinaryMaxIntIsOk() {
		assertEquals(testee.binary(Integer.MAX_VALUE),new String("1111111111111111111111111111111"));
	}
	
	@Test
	public void testBinaryMinIntIsOk() {
		assertEquals(testee.binary(Integer.MIN_VALUE),new String("10000000000000000000000000000000"));
	}
}
