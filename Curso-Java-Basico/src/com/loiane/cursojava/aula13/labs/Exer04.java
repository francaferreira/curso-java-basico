package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça as 4 notas bimestrais e mostre a média.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro número: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Didite o segundo número: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro número: ");
		double num3 = scan.nextDouble();
		
		System.out.println("Digite o quarto número: ");
		double num4 = scan.nextDouble();
		
		double resultado = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A média é: " + resultado);
		
		
		
        scan.close();
	}

}
