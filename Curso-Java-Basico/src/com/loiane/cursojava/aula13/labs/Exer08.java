package com.loiane.cursojava.aula13.labs;

import java.util.Scanner;

public class Exer08 {

	public static void main(String[] args) {
		// Fa�a um Programa que pergunte quanto voc� ganha por hora e o n�mero de horas trabalhadas no m�s. 
		//Calcule e mostre o total do seu sal�rio no referido m�s.
		//Sal�rio = 3.222,43/8hs = 402,804.
		//8 * 6dias = 48hs * 4 semanas = 192 horas no mes.
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Quanto voc� ganha por hora: ");
		double porHora = scan.nextDouble();
		
		System.out.println("Horas trabalhadas no m�s: ");
		double horaTrabalhadoMes = scan.nextDouble();
		
		double resultado = (porHora * horaTrabalhadoMes);
		
		System.out.println("Total de Sal�rio �: " + resultado);
		
	
		scan.close();
        
	}

}
