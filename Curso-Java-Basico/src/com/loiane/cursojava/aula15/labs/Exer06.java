package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior deles.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Didite o terceiro n�mero: ");
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 � maior:" + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 � maior: " + num2);
		}else {
			System.out.println("num3 � maior: " + num3);
		}
		

		scan.close();
	}

}
