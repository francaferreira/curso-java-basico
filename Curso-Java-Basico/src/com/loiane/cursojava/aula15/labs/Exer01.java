package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer01 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a dois n�meros e imprima o maior deles.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		if (num1 > num2) {
			System.out.println("O num1 � maior: " + num1);
		}else {
			System.out.println("O num2 � maior: " + num2);
		}

		scan.close();
	}

}
