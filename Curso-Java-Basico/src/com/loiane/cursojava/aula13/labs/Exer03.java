package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		
		//Fa�a um Programa que pe�a dois n�meros e imprima a soma.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o primeriro n�mero: ");
		int numero1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int numero2 = scan.nextInt();
		
		System.out.println("A soma �: " + (numero1 + numero2));
		
		scan.close();
		

	}

}
