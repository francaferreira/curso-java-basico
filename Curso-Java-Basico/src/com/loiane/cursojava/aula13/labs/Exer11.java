package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/* Faça um Programa que peça 2 números inteiros e um número real. Calcule e mostre:
		 o produto do dobro do primeiro com metade do segundo .
		 a soma do triplo do primeiro com o terceiro.
		 o terceiro elevado ao cubo.*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite primeiro número: ");
		int num1 = scan.nextInt();
		
		System.out.println("Didite segundo número: ");
		int num2 = scan.nextInt();
		
		System.out.println("digite o número real: ");
		double r = scan.nextDouble();
		
		int resultado1 = (num1 * 2) * (num2 / 2); 
		double resultado2 = (num1 * 3) + r;
		double resultado3 = Math.pow(r, 3);
		
		System.out.println("Resultado 1: " + resultado1);
		System.out.println("Resultado 2: " + resultado2);
		System.out.println("resultado 3: " + resultado3);
		
        scan.close();
	}

}
