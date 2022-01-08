package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer06 {

	public static void main(String[] args) {
		// Faça um Programa que leia três números e mostre o maior deles.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Didite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		if (num1 > num2 && num1 > num3) {
			System.out.println("num1 é maior:" + num1);
		}else if (num2 > num1 && num2 > num3) {
			System.out.println("num2 é maior: " + num2);
		}else {
			System.out.println("num3 é maior: " + num3);
		}
		

		scan.close();
	}

}
