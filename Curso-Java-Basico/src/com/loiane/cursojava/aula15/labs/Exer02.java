package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		// Fa�a um Programa que pe�a um valor e mostre na tela se o valor � positivo ou negativo.
		
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Mostre na tela  o valor: ");
		int num = scan.nextInt();
		
		
		if (num >= 0) {
			System.out.println("Valor positivo");
		}else {
			System.out.println("Valor � negativo");
		}
		
		scan.close();

	}

}
