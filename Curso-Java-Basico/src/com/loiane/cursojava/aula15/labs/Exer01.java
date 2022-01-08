package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// Faça um Programa que peça dois números e imprima o maior deles.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O num1 é maior: " + num1);
		}else {
			System.out.println("O num2 é maior: " + num2);
		}

		scan.close();
	}

}
