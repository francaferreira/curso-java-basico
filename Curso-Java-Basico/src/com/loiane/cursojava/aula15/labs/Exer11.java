package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer11 {

	public static void main(String[] args) {
		/*As Organiza��es Tabajara resolveram dar um aumento de sal�rio aos seus colaboradores e 
		  lhe contraram para desenvolver o programa que calcular� os reajustes.
		  Fa�a um programa que recebe o sal�rio de um colaborador e o reajuste segundo o seguinte 
		  crit�rio, baseado no sal�rio atual:
		  sal�rios at� R$ 280,00 (incluindo) : aumento de 20%
		  sal�rios entre R$ 280,00 e R$ 700,00 : aumento de 15%
		  sal�rios entre R$ 700,00 e R$ 1500,00 : aumento de 10%
		  sal�rios de R$ 1500,00 em diante : aumento de 5% Ap�s o aumento ser realizado, informe na tela:
			o sal�rio antes do reajuste;
			o percentual de aumento aplicado;
			o valor do aumento;
			o novo sal�rio, ap�s o aumento.*/
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Digite o sal�rio:");
		double salario = scan.nextDouble();
		
		int percentual = 0;
		if (salario <= 280) {
			percentual = 20;
		}else if (salario > 280 && salario < 700) {
			percentual = 15;
		}else if (salario >= 700 && salario < 1500) {
			percentual = 10;
		}else if (salario >= 1500) {
			percentual = 5;
		}
		
		double aumento = (salario / 100) * percentual;
		double salarioAjustado = salario + aumento;
		
		System.out.println("Sal�rio: " + salario);
		System.out.println("Percentual: " + percentual);
		System.out.println("Aumento: " + aumento);
		System.out.println("Sal�rio Ajustado: " + salarioAjustado);
		
		scan.close();

	}

}
