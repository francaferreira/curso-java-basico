package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a a temperatura em graus Fahrenheit, transforme e mostre a temperatura em graus Celsius.
		// C = 5 * ((F-32) / 9).
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Temperatura em Fahrenheit: ");
		double fahrenheit = scan.nextDouble();
		
		double celsius = 5 * ((fahrenheit - 32) / 9);
		
		System.out.println("A temperatura em fahrenheit " + fahrenheit + " � igual a temperatura em grau celsius " + celsius);
		
		
		scan.close();
	}

}
