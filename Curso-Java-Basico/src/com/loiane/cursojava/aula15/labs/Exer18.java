package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer18 {

	public static void main(String[] args) {
		/*Fa�a um Programa que pe�a um n�mero inteiro e determine se ele � par ou impar. 
		  Dica: utilize o operador m�dulo (resto da divis�o).*/
		 
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite um n�mero: ");
		int num = scan.nextInt();
		
	    if (num % 2 == 0) {
	    	System.out.println("par");
	    }else {
	    	System.out.println("impar");
	    }
		
		
        scan.close();
	}

}
