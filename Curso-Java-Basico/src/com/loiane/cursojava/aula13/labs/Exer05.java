package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
	 
		//Fa�a um Programa que converta metros para cent�metros
		//100 cent�metro = 1 metro.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.printf("Metros: ");
		double metro = scan.nextDouble();
		
		//System.out.println("Digite outro numero: ");
		//double centimetro = scan.nextDouble();
		
		double resultado = (metro) * 100;
		
		System.out.printf("Quantos cent�metro: " + resultado);
		
		scan.close();
		

	}

}
