package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		/* Tendo como dado de entrada a altura (h) de uma pessoa, construa um algoritmo que 
		calcule seu peso ideal, utilizando as seguintes fórmulas:
		Para homens: (72.7*h) - 58
		Para mulheres: (62.1*h) - 44.7*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual é altura de um homem: ");
		double alturahomen = scan.nextDouble();
		
		System.out.println("Qua é altura de uma mulher: ");
		double alturamulher = scan.nextDouble();
		
		double resultado1 = (72.7 * alturahomen) - 58;
		double resultado2 = (62.1 * alturamulher) - 44.7;
		
		System.out.println("Resultado1: " + resultado1);
		System.out.println("Resultado2: " + resultado2);
        
		scan.close();
	}

}
