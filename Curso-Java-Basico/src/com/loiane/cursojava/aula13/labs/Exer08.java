package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas no mês. 
		//Calcule e mostre o total do seu salário no referido mês.
		//Salário = 3.222,43/8hs = 402,804.
		//8 * 6dias = 48hs * 4 semanas = 192 horas no mes.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto você ganha por hora: ");
		double porHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas no mês: ");
		double horaTrabalhadoMes = scan.nextDouble();
		
		double resultado = (porHora * horaTrabalhadoMes);
		
		System.out.println("Total de Salário é: " + resultado);
		
	
		scan.close();
        
	}

}
