package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;


public class Exer06 {

	public static void main(String[] args) {
		//Fa�a um Programa que pe�a o raio de um c�rculo, calcule e mostre sua �rea.
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite �rea do c�rculo em metros: ");
		double metro = scan.nextDouble();
		double raio = Math.PI * Math.pow(2, metro);
		
		System.out.println("A �rea do c�rculo �: " + raio);
		
		scan.close();

	}

}
