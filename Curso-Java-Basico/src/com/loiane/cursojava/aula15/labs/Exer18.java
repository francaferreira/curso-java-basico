package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/*Faça um Programa que peça um número inteiro e determine se ele é par ou impar. 
		  Dica: utilize o operador módulo (resto da divisão).*/
		 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
		int num = scan.nextInt();
		
	    if (num % 2 == 0) {
	    	System.out.println("par");
	    }else {
	    	System.out.println("impar");
	    }
		
		
        scan.close();
	}

}
