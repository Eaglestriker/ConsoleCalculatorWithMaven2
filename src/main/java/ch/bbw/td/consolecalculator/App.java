package ch.bbw.td.consolecalculator;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Tim Dubath
 * @version 10.01.2020
 */

public class App {
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		int valueA;
		int valueB;
		
		System.out.println("Console Calculator");
		System.out.println("==================");
		System.out.println();
		
		System.out.println("Bitte erste und danach zweite Zahl eingeben");
		
		Scanner numberOne = new Scanner(System.in);
		
		
		
		Scanner numberTwo = new Scanner(System.in);
		
		valueA = numberOne.nextInt();
		valueB = numberTwo.nextInt();
		
		
		
		
		System.out.println("Summe " + valueA + " + " + valueB + " = " + calculator.summe(valueA, valueB));
		
	}

}
