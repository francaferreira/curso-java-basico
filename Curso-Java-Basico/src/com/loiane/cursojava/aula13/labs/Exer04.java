package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		
		//Fa�a um Programa que pe�a as 4 notas bimestrais e mostre a m�dia.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		double num1 = scan.nextDouble();
		
		System.out.println("Didite o segundo n�mero: ");
		double num2 = scan.nextDouble();
		
		System.out.println("Digite o terceiro n�mero: ");
		double num3 = scan.nextDouble();
		
		System.out.println("Digite o quarto n�mero: ");
		double num4 = scan.nextDouble();
		
		double resultado = (num1 + num2 + num3 + num4) / 4;
		
		System.out.println("A m�dia �: " + resultado);
		
		
		
        scan.close();
	}

}
