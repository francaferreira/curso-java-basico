package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		
		// Fa�a um Programa que pe�a a temperatura em graus Celsius, transforme e mostre em graus Fahrenheit.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Temperatura em graus Celsius: ");
		double  c = scan.nextDouble();
		
		double f = (( c * 1.8) + 32);
		
		System.out.println("A temperatura " + c + " C � igual a " + f + " F ");

        scan.close();
	}

}
