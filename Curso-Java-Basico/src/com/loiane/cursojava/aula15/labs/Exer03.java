package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		// Fa�a um Programa que verifique se uma letra digitada � "F" ou "M". 
		//Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inv�lido.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Letra digitada � F ou M: ");
		String letra = scan.next();
		
		if (letra.equalsIgnoreCase("f")) {
			System.out.println("F - Femenino");
		}else if (letra.equalsIgnoreCase("M")) {
			System.out.println("M - Masculino");
		}else {
			System.out.println("Sexo Inv�lido");
		}
			
		scan.close();

	}

}
