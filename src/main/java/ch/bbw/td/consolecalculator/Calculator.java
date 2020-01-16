package ch.bbw.td.consolecalculator;

/**
 * 
 * @author Tim Dubath
 * @version 10.01.2020
 */

public class Calculator {

	public int summe(int summand1, int summand2) {
		return summand1 + summand2;
	}

	public int subtraktion(int value1, int value2) {

		return value1 - value2;
	}

	public double division(double value1, double value2) {
		return value1 / value2;

	}

	private int muliplikation(int value1, int value2) {
		return value1 * value2;
	}

	public int quadrieren(int value1) {
		return value1 * value1;
	}

	protected double wurzelBerechnung(int value) {
		return Math.sqrt(value);
	}

	public double zinseszins(double anfangskapital, double zinssatz, double jahre) {
		double q = 1 + zinssatz / 100;
		double endkap = anfangskapital * Math.pow(q, jahre);
		endkap = Math.rint(endkap * 100);
		endkap = endkap / 100;
		return endkap;
	}

	public String binary(int number) {
		String binary = Integer.toBinaryString(number);
		return binary;
	}

	public String zahlensystemWandler(int system, int zahlUmrechnung) {
		String ausgabe = "fehler";

		// 1 = dezimal
		// 2 = binär
		// 3 = oktal
		// 4 = hexadezimal
		switch (system) {
		case 1:
			ausgabe = Integer.toString(zahlUmrechnung);
			break;

		case 2:
			ausgabe = Integer.toBinaryString(zahlUmrechnung);
			break;

		case 3:
			ausgabe = Integer.toOctalString(zahlUmrechnung);
			break;

		case 4:
			ausgabe = Integer.toHexString(zahlUmrechnung);
			break;

		default:
			System.out.println("No fix number_system");

		}
		return ausgabe;
	}
}