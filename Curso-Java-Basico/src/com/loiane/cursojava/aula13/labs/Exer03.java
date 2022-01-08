package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		//Faça um Programa que peça dois números e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeriro número: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo número: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma é: " + (numero1 + numero2));
		
		scan.close();
		

	}

}
