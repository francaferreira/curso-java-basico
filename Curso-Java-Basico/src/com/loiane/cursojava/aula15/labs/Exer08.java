package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		/* Faça um programa que pergunte o preço de três produtos e 
		   informe qual produto você deve comprar, 
		   sabendo que a decisão é sempre pelo mais barato. */

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Notebook1: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Notebook2: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Notebook3: ");
		double produto3 = scan.nextDouble();
		
		if (produto1 <= produto2 && produto1 <= produto3 ) {
			System.out.println("O notebook1 é mais barato: " + produto1);
		}else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O notebook2 é mais barato: " + produto2);
		}else {
			System.out.println("O notebook3 é mais barato: " + produto3);
		}
		
		
		
		
		scan.close();
	}

}
