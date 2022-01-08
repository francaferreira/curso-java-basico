package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		//Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite área do quadrado: ");
		double area = scan.nextDouble();
		
		double resultado = Math.pow(area, 2);

		
		System.out.printf("Área de um quadrado é: " + resultado + ", Dobro da área é: " + (resultado * 2));
		
		
		
		scan.close();
	}

}
