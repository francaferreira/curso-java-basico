package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer13 {

	public static void main(String[] args) {
		// Fa�a um Programa que leia um n�mero e exiba o dia correspondente da semana. 
		// (1-Domingo, 2- Segunda, etc.), se digitar outro valor deve aparecer valor inv�lido.

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o dia da semana de 1-7: ");
		int diaSemana = scan.nextInt();
		
		/*if (diaSemana == 1) {
			System.out.println("Domingo");
		}else if (diaSemana == 2) {
			System.out.println("Segunda");
		}else if (diaSemana == 3) {
			System.out.println("Ter�a Feira");
		}else if (diaSemana == 4) {
			System.out.println("Quarta Feira");
		}else if (diaSemana == 5) {
			System.out.println("Quinta Feira");
		}else if (diaSemana == 6) {
			System.out.println("Sexta Feira");
		}else if (diaSemana == 7) {
			System.out.println("S�bado");
		}else {
			System.out.println("Valor inv�lido");
		}*/
		
		switch (diaSemana) {
		case 1:{System.out.println("Domindo");break;}
		case 2:{System.out.println("Segunda feira");break;}
		case 3:{System.out.println("Ter�a Feira");break;}
		case 4:{System.out.println("Quarta Feira");break;}
		case 5:{System.out.println("Quinta Feira");break;}
		case 6:{System.out.println("Sexta Feira");break;}
		case 7:{System.out.println("S�bado");break;}
		default:System.out.println("Valor inv�lido");
		}
		
		
		
		scan.close();
	}

}
