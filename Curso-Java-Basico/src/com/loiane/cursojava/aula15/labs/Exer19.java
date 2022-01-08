package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer19 {

	public static void main(String[] args) {
		/* Fa�a um Programa que leia 2 n�meros e em seguida pergunte ao usu�rio qual 
		   opera��o ele deseja realizar. O resultado da opera��o deve ser acompanhado de uma frase 
		   que diga se o n�mero �:
		   par ou �mpar;
		   positivo ou negativo;*/

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o primeiro n�mero: ");
		int num1 = scan.nextInt();
		
		System.out.println("Digite o segundo n�mero: ");
		int num2 = scan.nextInt();
		
		System.out.println("Qual opera��o voc� que realizar + - * / ");
		String operacao = scan.next();
		
		double resultado = 0;
		boolean valida = true;
		
		switch (operacao) {
		case "+": resultado = num1 + num2; break;
		case "-": resultado = num1 - num2; break;
		case "*": resultado = num1 * num2; break;
		case "/": resultado = num1 / num2; break;
		default: System.out.println("Opera��o Inv�lida"); valida = false;
		} 
		
		if (valida) {
			
			System.out.println("Resultado: " + resultado);
			
			if (resultado >=0) {
				System.out.println("Resultado positivo");
			}else {
				System.out.println("Resultado negativo");
			}
			
			if (resultado % 2 == 0) {
				System.out.println("Resultado par");
			}else {
				System.out.println("Resultado negativo");
			}
		}
		
		
		
		scan.close();
	}

}
