package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer17 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pe�a um n�mero correspondente a um determinado ano e em 
		   seguida informe se este ano � ou n�o bissexto.*/
		 

		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite com ano: ");
		
		int ano = scan.nextInt();
		
		if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
			System.out.println("Ano � bissexto");
		}else {
			System.out.println("Ano n�o � bissexto");
		}
		
		
		
		scan.close();
	}

}
