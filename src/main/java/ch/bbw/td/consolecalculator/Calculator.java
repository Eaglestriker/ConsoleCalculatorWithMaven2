package ch.bbw.td.consolecalculator;

/**
 * 
 * @author Tim Dubath
 * @version 10.01.2020
 */

public class Calculator {
	
	
	public int summe(int summand1, int summand2)  {
		return summand1+summand2;
	}
	
	public int subtraktion(int value1, int value2) {
		
		return value1 - value2;
	}
	
	public double division(double value1, double value2) {
		return value1/value2;
		
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
}