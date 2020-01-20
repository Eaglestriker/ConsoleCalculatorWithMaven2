package ch.bbw.td.consoleCalculator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.util.ArrayList;

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

	// Alle Tests waren bereits von Anfang an so geschrieben,
	// dass Sie nur eine Funktion einer Klasse testen und nicht mehrere

	@Before
	public void setUp() {
		testee = new Calculator();
	}

	// Tests für die Summe Methode
	// Testerstellung für eine + Rechnung mit 2 positiven Zahlen
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
		assertTrue(testee.summe(-10, 20) == 10);
	}

	@Test
	public void testSumme1positiv1negativIsOk() {
		assertTrue(testee.summe(20, -10) == 10);
	}

	@Test
	public void testSumme2mal0IsOk() {
		assertTrue(testee.summe(0, 0) == 0);
	}

	@Test
	public void testSumme2malMinus0IsOk() {
		assertTrue(testee.summe(-0, -0) == 0);
	}

	@Test
	public void testSumme1Plus01Minus0IsOk() {
		assertTrue(testee.summe(0, -0) == 0);
	}

	@Test
	public void testSumme1Minus01Plus0IsOk() {
		assertTrue(testee.summe(-0, 0) == 0);
	}

	@Test
	public void testSummePlusMinus0IsOk() {
		assertTrue(testee.summe(5, -0) == 5);
	}

	@Test
	public void testSummeMinus0PlusIsOk() {
		assertTrue(testee.summe(-0, 5) == 5);
	}

	@Test
	public void testSummeMinus0MinusIsOk() {
		assertTrue(testee.summe(-0, -5) == -5);
	}

	@Test
	public void testSummeMinusMinus0IsOk() {
		assertTrue(testee.summe(-5, -0) == -5);
	}

	@Test
	public void testSummeMinusPlus0IsOk() {
		assertTrue(testee.summe(-5, 0) == -5);
	}

	@Test
	public void testSummePlus0MinusIsOk() {
		assertTrue(testee.summe(0, -5) == -5);
	}

	@Test
	public void testSumme0PlusIsOk() {
		assertTrue(testee.summe(0, 5) == 5);
	}

	@Test
	public void testSummePlus0IsOk() {
		assertTrue(testee.summe(5, 0) == 5);
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

	// Test für die Subtraktion Methode
	// Testerstellung für eine - Rechnung mit zwei positiven Zahlen
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
		assertTrue(testee.subtraktion(-10, 20) == -30);
	}

	@Test
	public void testSubtraction1positiv1negativIsOk() {
		assertTrue(testee.subtraktion(20, -10) == 30);
	}

	@Test
	public void testSubtraction2mal0IsOk() {
		assertTrue(testee.subtraktion(0, 0) == 0);
	}

	@Test
	public void testSubtraction2malMinus0IsOk() {
		assertTrue(testee.subtraktion(-0, -0) == 0);
	}

	@Test
	public void testSubtraction1Plus01Minus0IsOk() {
		assertTrue(testee.subtraktion(0, -0) == 0);
	}

	@Test
	public void testSubtraction1Minus01Plus0IsOk() {
		assertTrue(testee.subtraktion(-0, 0) == 0);
	}

	@Test
	public void testSubtractionPlusMinus0IsOk() {
		assertTrue(testee.subtraktion(5, -0) == 5);
	}

	@Test
	public void testSubtractionMinus0PlusIsOk() {
		assertTrue(testee.subtraktion(-0, 5) == -5);
	}

	@Test
	public void testSubtractionMinus0MinusIsOk() {
		assertTrue(testee.subtraktion(-0, -5) == 5);
	}

	@Test
	public void testSubtractionMinusMinus0IsOk() {
		assertTrue(testee.subtraktion(-5, -0) == -5);
	}

	@Test
	public void testSubtractionMinusPlus0IsOk() {
		assertTrue(testee.subtraktion(-5, 0) == -5);
	}

	@Test
	public void testSubtractionPlus0MinusIsOk() {
		assertTrue(testee.subtraktion(0, -5) == 5);
	}

	@Test
	public void testSubtraction0PlusIsOk() {
		assertTrue(testee.subtraktion(0, 5) == -5);
	}

	@Test
	public void testSubtractionPlus0IsOk() {
		assertTrue(testee.subtraktion(5, 0) == 5);
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

	// Division Tests
	@Test
	public void testDivisionPositivDurchPositivIsOk() {
		assertTrue(testee.division(3, 2) == 1.5);
	}

	@Test
	public void testDivisionPositivDurchNegativIsOk() {
		assertTrue(testee.division(5, -5) == -1);
	}

	@Test
	public void testDivisionNegativDurchPositivIsOk() {
		assertTrue(testee.division(-5, 5) == -1);
	}

	@Test
	public void testDivisionNegativDurchNegativIsOk() {
		assertTrue(testee.division(-5, -5) == 1);
	}

	@Test
	public void testDivisionZeroDurchNegativIsOk() {
		assertTrue(testee.division(0, -10) == 0);
	}

	@Test
	public void testDivisionZeroDurchPositivIsOk() {
		assertTrue(testee.division(0, 30) == 0);
	}

	@Test(expected = AssertionError.class)
	public void testDivisionZeroDurchZeroIsOk() {
		assertTrue(testee.division(0, 0) == 0);
	}

	// Diese drei Tests failen aus unerklärlichen Gründen. Egal was ich expecte sie
	// failen. Benötige Hilfe von P. Rutschmann

	@Test(expected = AssertionError.class)
	public void testDivisionPositivDurchZeroIsOk() {
		assertTrue(testee.division(10, 0) == 0);
	}

	@Test
	public void testDivisionPositivDurchZeroIsInfinity() {
		assertTrue(testee.division(10, 0) == Double.POSITIVE_INFINITY);
	}

	@Test(expected = AssertionError.class)
	public void testDivisionNegativDurchZeroIsOk() {
		assertTrue(testee.division(-5, 0) == 0);
	}

	@Test
	public void testDivisionNegativDurchZeroexceptionIsOk() {
		assertTrue(testee.division(-5, 0) == Double.NEGATIVE_INFINITY);
	}

	@Test
	public void testDivisionPositivNegativIsLessThenZero() {
		assertTrue(testee.division(25, -40) < 0);
	}

	@Test
	public void testDivision2NegativGreaterThenZero() {
		assertTrue(testee.division(-30, -15) > 0);
	}

	// Multiplikation Testfälle
	// Die Methode Multiplikation ist privat und kann somit nicht getestet werden.
	@Ignore
	@Test
	public void testMultiplicationPositiveTimesPositiveIsOk() {
		// assertTrue(testee.muliplikation(10,10)==100);
	}

	// Quadrationen Testfälle
	// Es kann nicht darauf zugegriffen werden da die Methode die Sichtbarkeit
	// Package besitzt (Dies heist soviel wie das man nur im selben Package darauf
	// zugreifen kann).
	// Aus diesem Grund kann man die Methode auchnicht testen.
	@Ignore
	@Test
	public void testQuadrierenPositveIsOk() {
		// assertTrue(testee.quadrieren(7) == 49);
	}

	@Ignore
	@Test
	public void testQuadrierenNegativeIsOk() {
		// assertTrue(testee.quadrieren(-5) == 25);
	}

	@Ignore
	@Test
	public void testQuadrierenZeroIsOk() {
		// assertTrue(testee.quadrieren(0) == 0);

	}

	// Wurzelberechnung Tests
	// Methode kann nicht getestet werden, da sie in einem anderen Package liegt
	// und somit keinen Zugriff auf Tests in anderen Packages gewährt dies liegt an
	// der Sichtbarkeit Protected.
	@Ignore
	@Test
	public void testWurzelPositivIsOk() {
		// assertTrue(testee.wurzelBerechnung(49)==7);
	}

	// Zinseszins Test
	@Test
	public void testZinseszinsPositiveIsOk() {
		assertTrue(testee.zinseszins(100000, 1, 5) == 105101.01);
	}

	@Test
	public void testZinseszinsZinsNegativIsOk() {
		assertTrue(testee.zinseszins(100000, -1, 5) == 95099.0);
	}

	@Test
	public void testZinseszinsAnfangskapitalNegativIsOk() {
		assertTrue(testee.zinseszins(-100000, 1, 5) == -105101.01);
	}

	@Test
	public void testZinseszinsAnfangskapitalNegativZinsenNegativIsOk() {
		assertTrue(testee.zinseszins(-100000, -1, 5) == -95099.0);
	}

	// Binary Tests
	@Test
	public void testBinaryPositivIsOk() {
		assertEquals(testee.binary(25), new String("11001"));
	}

	@Test
	public void testBinaryNegativIsOk() {
		assertEquals(testee.binary(-25), new String("11111111111111111111111111100111"));
	}

	@Test
	public void testBinaryMaxIntIsOk() {
		assertEquals(testee.binary(Integer.MAX_VALUE), new String("1111111111111111111111111111111"));
	}

	@Test
	public void testBinaryMinIntIsOk() {
		assertEquals(testee.binary(Integer.MIN_VALUE), new String("10000000000000000000000000000000"));
	}

	// Zahlensysteme Tests
	// 1 = dezimal
	// 2 = binär
	// 3 = oktal
	// 4 = hexadezimal

	// Decimal to Decimal test
	@Test
	public void testZahlensystemeDecimalToDecimalPositivIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "10"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("10"));
	}

	@Test
	public void testZahlensystemeDecimalToDecimalNegativIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-10"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("-10"));
	}

	@Test
	public void testZahlensystemeDecimalToDecimalMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "2147483647"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("2147483647"));
	}

	@Test
	public void testZahlensystemeDecimalToDecimalMinIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-2147483648"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("-2147483648"));
	}

	// Decimal to binary tests
	@Test
	public void testZahlensystemeDecimalToBinaerPositivIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "8"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("1000"));
	}

	@Test
	public void testZahlensystemeDecimalToBinaerNegativIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-8"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("11111111111111111111111111111000"));
	}

	@Test
	public void testZahlensystemeDecimalToBinaerMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "2147483647"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("1111111111111111111111111111111"));
	}

	@Test
	public void testZahlensystemeDecimalToBinaerMinIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-2147483648"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("10000000000000000000000000000000"));
	}

	// Decimal to Octal test
	@Test
	public void testZahlensystemeDecimalToOctalPositivIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "77"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("115"));
	}

	@Test
	public void testZahlensystemeDecimalToOctalNegativIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-77"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("37777777663"));
	}

	@Test
	public void testZahlensystemeDecimalToOctalMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "2147483647"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("17777777777"));
	}

	@Test
	public void testZahlensystemeDecimalToOctalMinIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-2147483648"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("20000000000"));
	}

	// Decimal to Hex test
	@Test
	public void testZahlensystemeDecimalToHexPositivIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "150"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("96"));
	}

	@Test
	public void testZahlensystemeDecimalToHexNegativIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-300"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("fffffed4"));
	}

	@Test
	public void testZahlensystemeDecimalToHexMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "2147483647"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("7fffffff"));
	}

	@Test
	public void testZahlensystemeDecimalToHexMinIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(1, "-2147483648"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("80000000"));
	}

	// binary to Decimal
	@Test
	public void testZahlensystemeBinaryToDecPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "101"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("5"));
	}

	@Test
	public void testZahlensystemeBinaryToDecNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "-101"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("-5"));
	}

	@Test
	public void testZahlensystemeBinaryToDecimalMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1111111111111111111111111111111"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("2147483647"));
	}

	@Test
	public void testZahlensystemeBinaryToDecimalGrosserIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1000000000000000000000000000000"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("1073741824"));
	}

	// Binary to binary
	@Test
	public void testZahlensystemeBinaryToBinaryPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "111"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("111"));
	}

	@Test
	public void testZahelnsystemeBinaryToBinaryNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "-111"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("-111"));
	}

	// Binary to Octal
	@Test
	public void testZahlensystemeBinaryToOctalIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1011"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("13"));
	}

	@Test
	public void testZahlensystemeBinaryToOctalMaxIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1111111111111111111111111111111"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("17777777777"));
	}

	@Test
	public void testZahlensystemeBinaryToOctalMinIntIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "100000000000000000000000000000"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("4000000000"));
	}

	// Binary to Hexadecimal
	@Test
	public void testZahlensystemeBinaryToHexIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1111"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("f"));
	}

	@Test
	public void testZahlensystemeBinaryToHexMaxIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1111111111111111111111111111111"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("7fffffff"));
	}

	@Test
	public void testZahlensystemeBinaryToHexMinIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(2, "1"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("1"));
	}
	
	//Oktal to Decimal
	@Test
	public void testZahlensystemeOctalToDecimalPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "77"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("63"));
	}
	
	@Test
	public void testZahlensystemeOctalToDecimalNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-77"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("-63"));
	}
	
	@Test
	public void testZahlensystemeOctalToDecimalMaxIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "17777777777"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("2147483647"));
	}
	
	@Test
	public void testZahlensystemeOctalToDecimalMinIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-17777777777"));
		String ergebnis = ergebnisse.get(0);
		assertEquals(ergebnis, new String("-2147483647"));
	}
	
	//Oktal to binary
	@Test
	public void testZahlensystemeOctalToBinaryPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "777"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("111111111"));
	}
	
	@Test
	public void testZahlensystemeOctalToBinaryNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-777"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("11111111111111111111111000000001"));
	}
	
	@Test
	public void testZahlensystemeOctalToBinaryMaxIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "17777777777"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("1111111111111111111111111111111"));
	}
	
	@Test
	public void testZahlensystemeOctalToBinaryMinIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-20000000000"));
		String ergebnis = ergebnisse.get(1);
		assertEquals(ergebnis, new String("10000000000000000000000000000000"));
	}
	
	//Oktal to Oktal
	@Test
	public void testZahlensystemeOctalToOctalPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "7777"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("7777"));
	}
	
	@Test
	public void testZahlensystemeOctalToOctalNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-7777"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("-7777"));
	}
	
	@Test
	public void testZahlensystemeOctalToOctalMaxIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "17777777777"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("17777777777"));
	}
	
	@Test
	public void testZahlensystemeOctalToOctalMinIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-17777777777"));
		String ergebnis = ergebnisse.get(2);
		assertEquals(ergebnis, new String("-17777777777"));
	}
	
	//Oktal to Hex
	@Test
	public void testZahlensystemeOctalToHexPositiveIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "7777"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("fff"));
	}
	
	@Test
	public void testZahlensystemeOctalToHexNegativeIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-77777"));
		String ergebnis = ergebnisse.get(3);
		assertEquals(ergebnis, new String("ffff8001"));
	}
	
	@Test
	public void testZahlensystemeOctalToHexMaxIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "17777777777"));
		String ergebnis = ergebnisse.get(3);
		System.out.println(ergebnisse.get(3));
		assertEquals(ergebnis, new String("7fffffff"));
	}
	
	@Test
	public void testZahlensystemeOctalToHexMinIsOk() {
		ArrayList<String> ergebnisse = new ArrayList<String>();
		ergebnisse.addAll(testee.zahlensystemWandler(3, "-17777777777"));
		String ergebnis = ergebnisse.get(3);
		System.out.println(ergebnisse.get(3));
		assertEquals(ergebnis, new String("80000001"));
	}
}