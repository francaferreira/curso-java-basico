package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/*Tendo como dados de entrada a altura de uma pessoa, 
		  construa um algoritmo que calcule seu peso ideal, 
		  a seguinte fórmula: (72.7*altura) - 58 */
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Qual é sua altura: ");
		double a = scan.nextDouble();
		
		double resultado = (72.7 * a) - 58;
		
		System.out.println("Seu peso ideal é: " + resultado);
       
		scan.close();
	}

}
