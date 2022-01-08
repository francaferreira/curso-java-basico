package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Mostre na tela  o valor: ");
		int num = scan.nextInt();
		
		
		if (num >= 0) {
			System.out.println("Valor positivo");
		}else {
			System.out.println("Valor é negativo");
		}
		
		scan.close();

	}

}
