package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia tr�s n�meros e mostre o maior e o menor deles.
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Digite o terceiro n�mero: ");
		int num3 = scan.nextInt();
		
		if (num1 >= num2 && num1 >= num3) {
			System.out.println("num1 � maior: " + num1);
		}else if (num2 >= num1 && num2 >= num3) {
			System.out.println("num2 � maior: " + num2);
		}else {
			System.out.println("num3 � maior: " + num3);
		}
		
		if (num1 <= num2 && num1 <= num3) {
			System.out.println("num1 � menor: " + num1);
		}else if (num2 <= num1 && num2 <= num3) {
			System.out.println("num2 � menor: " + num2);
		}else {
			System.out.println("num3 � menor: " + num3);
		}
		
		
		
		scan.close();
	}

}
