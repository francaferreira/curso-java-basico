package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		/* Fa�a um programa que pergunte o pre�o de tr�s produtos e 
		   informe qual produto voc� deve comprar, 
		   sabendo que a decis�o � sempre pelo mais barato. */

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Notebook1: ");
		double produto1 = scan.nextDouble();
		
		System.out.println("Notebook2: ");
		double produto2 = scan.nextDouble();
		
		System.out.println("Notebook3: ");
		double produto3 = scan.nextDouble();
		
		if (produto1 <= produto2 && produto1 <= produto3 ) {
			System.out.println("O notebook1 � mais barato: " + produto1);
		}else if (produto2 <= produto1 && produto2 <= produto3) {
			System.out.println("O notebook2 � mais barato: " + produto2);
		}else {
			System.out.println("O notebook3 � mais barato: " + produto3);
		}
		
		
		
		
		scan.close();
	}

}
