package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {

	public static void main(String[] args) {
		//Fa�a um Programa que calcule a �rea de um quadrado, em seguida mostre o dobro desta �rea para o usu�rio.

		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite �rea do quadrado: ");
		double area = scan.nextDouble();
		
		double resultado = Math.pow(area, 2);

		
		System.out.printf("�rea de um quadrado �: " + resultado + ", Dobro da �rea �: " + (resultado * 2));
		
		
		
		scan.close();
	}

}
