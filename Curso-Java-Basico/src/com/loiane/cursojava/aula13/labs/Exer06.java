package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;


public class Exer06 {

	public static void main(String[] args) {
		//Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite área do círculo em metros: ");
		double metro = scan.nextDouble();
		double raio = Math.PI * Math.pow(2, metro);
		
		System.out.println("A área do círculo é: " + raio);
		
		scan.close();

	}

}
