package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		
		//Fa�a um Programa que pe�a um n�mero e ent�o mostre a mensagem O n�mero informado foi [n�mero].
		
		Scanner scan = new Scanner(System.in);
		int numero = scan.nextInt();
		System.out.println("O n�mero informado foi: " + numero);
		
		scan.close();
		
		

	}

}
