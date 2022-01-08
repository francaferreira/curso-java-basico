package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/*Fa�a um programa para a leitura de duas notas parciais de um aluno. 
		  O programa deve calcular a m�dia alcan�ada por aluno e apresentar:
		A mensagem "Aprovado", se a m�dia alcan�ada for maior ou igual a sete;
		A mensagem "Reprovado", se a m�dia for menor do que sete;
		A mensagem "Aprovado com Distin��o", se a m�dia for igual a dez.*/

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		double nota1 = scan.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double nota2 =scan.nextDouble();
		double soma = (nota1 + nota2) / 2 ;
		
		
		if (soma == 10) {
			System.out.println("Aprovado com distin��o");
		}else if (soma >= 7) {
			System.out.println("Aluno Aprovado");
		}else {
			System.out.println("Reprovado");
		}
		
		scan.close();
	}

}
