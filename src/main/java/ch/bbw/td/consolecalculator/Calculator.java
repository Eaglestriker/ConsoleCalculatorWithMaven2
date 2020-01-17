package ch.bbw.td.consolecalculator;

import java.util.ArrayList;

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

	int quadrieren(int value1) {
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

	public ArrayList<String> zahlensystemWandler(int system, String eingabe) {
		String ausgabe = "fehler";
		ArrayList<String> ergebnisse = new ArrayList<String>();
		// von jedem Zahlensystem in jedes umrechnen können
		// 1 = dezimal
		// 2 = binär
		// 3 = oktal
		// 4 = hexadezimal
		switch (system) {
		case 1:
			int number = Integer.parseInt(eingabe);
			ergebnisse.add(eingabe);
			ergebnisse.add(Integer.toBinaryString(number));
			ergebnisse.add(Integer.toOctalString(number));
			ergebnisse.add(Integer.toHexString(number));
			break;

		case 2:
			int number2 = Integer.parseInt(eingabe, 2);
			ergebnisse.add(Integer.toString(number2));
			ergebnisse.add(eingabe);
			ergebnisse.add(Integer.toOctalString(number2));
			ergebnisse.add(Integer.toHexString(number2));
			break;

		case 3:
			int number3 = Integer.parseInt(eingabe, 8);
			ergebnisse.add(Integer.toString(number3));
			ergebnisse.add(Integer.toBinaryString(number3));
			ergebnisse.add(eingabe);
			ergebnisse.add(Integer.toHexString(number3));
			break;

		case 4:
			int number4 = Integer.parseInt(eingabe, 16);
			ergebnisse.add(Integer.toString(number4));
			ergebnisse.add(Integer.toBinaryString(number4));
			ergebnisse.add(Integer.toOctalString(number4));
			ergebnisse.add(eingabe);
			break;

		default:
			System.out.println("No fix number_system");

		}
		return ergebnisse;
	}
}