package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada a altura de uma pessoa, 
		  construa um algoritmo que calcule seu peso ideal, 
		  a seguinte f�rmula: (72.7*altura) - 58 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual � sua altura: ");
		double a = scan.nextDouble();
		
		double resultado = (72.7 * a) - 58;
		
		System.out.println("Seu peso ideal �: " + resultado);
       
		scan.close();
	}

}
