package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer15 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a os 3 lados de um tri�ngulo. 
		  O programa dever� informar se os valores podem ser um tri�ngulo. 
		  Indique, caso os lados formem um tri�ngulo, se o mesmo �: equil�tero, is�sceles ou escaleno.
		Dicas:
			Tr�s lados formam um tri�ngulo quando a soma de quaisquer dois lados for maior que o terceiro;
			Tri�ngulo Equil�tero: tr�s lados iguais;
			Tri�ngulo Is�sceles: quaisquer dois lados iguais;
			Tri�ngulo Escaleno: tr�s lados diferentes;*/

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite lado 1: ");
		int lado1 = scan.nextInt();
		
		System.out.println("Digite lado 2: ");
		int lado2 = scan.nextInt();
		
		System.out.println("Digite lado3: ");
		int lado3 = scan.nextInt();
		
		if (((lado1 + lado2) > lado3) || ((lado1 + lado3) > lado2) ||
			((lado3 + lado2) > lado1)) {
			
		if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
			System.out.println("Tri�ngulo Equil�tero ");
		}else if (lado1 != lado2 && lado1 != lado3 && lado2 != lado3) {
			System.out.println("Tri�ngulo Escaleno ");
		}else if((lado1 == lado2) || 
				(lado1 == lado3) || 
				(lado2 == lado3)) {
			System.out.println("Tri�ngulo Is�sceles");
		}	
		
		}else {
			System.out.println("N�o forma um tri�ngulo");
		}
		
		
		scan.close();
	}

}
