package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer12 {

	public static void main(String[] args) {
		/*Fa�a um programa para o c�lculo de uma folha de pagamento, 
		  sabendo que os descontos s�o do Imposto de Renda, que depende do 
		  sal�rio bruto (conforme tabela abaixo) e 3% para o Sindicato e que o FGTS 
		  corresponde a 11% do Sal�rio Bruto, mas n�o � descontado (� a empresa que deposita). 
		  O Sal�rio L�quido corresponde ao Sal�rio Bruto menos os descontos. 
		  O programa dever� pedir ao usu�rio o valor da sua hora e a quantidade de horas trabalhadas no m�s.
           Desconto do IR:
           Sal�rio Bruto at� 900 (inclusive) - isento
           Sal�rio Bruto at� 1500 (inclusive) - desconto de 5%
           Sal�rio Bruto at� 2500 (inclusive) - desconto de 10%
           Sal�rio Bruto acima de 2500 - desconto de 20% Imprima na tela as informa��es, 
           dispostas conforme o exemplo abaixo. No exemplo o valor da hora � 5 e a quantidade de hora � 220.
           Sal�rio Bruto: (5 * 220)        : R$ 1100,00
           (-) IR (5%)                     : R$   55,00  
           (-) INSS ( 10%)                 : R$  110,00
           FGTS (11%)                      : R$  121,00
           Total de descontos              : R$  165,00
           Sal�rio Liquido                 : R$  935,00 */

		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Entre com valor/hora: ");
		double valorHora = scan.nextDouble();
		
		System.out.println("Entre com as horas trabalhadas no m�s: ");
		double qtdHoras = scan.nextDouble();
		
		double salarioBruto = valorHora * qtdHoras;
		
		int percentualIR = 0;
		if (salarioBruto <= 900) {
			percentualIR = 0;
		}else if (salarioBruto > 900 && salarioBruto <= 1500) {
			percentualIR = 5;
		}else if (salarioBruto > 1500 && salarioBruto <= 2500) {
			percentualIR = 10;
		}else if (salarioBruto > 2500){
			percentualIR = 20;
		}
		
		double ir = (salarioBruto / 100) * percentualIR;
		double inss = (salarioBruto / 100) * 10;
		double fgts = (salarioBruto / 100) * 11;
		double totalDescontos = ir + inss;
		double salarioLiquido = salarioBruto - totalDescontos;
		
		System.out.println("Sal�rio Bruto: (" + valorHora + " * " + qtdHoras + "); " + salarioBruto);
		System.out.println("(-) IR (" + percentualIR + "%):" + ir);
		System.out.println("(-) INSS (10%):" + inss);
		System.out.println("FGTS (11%):" + fgts);
		System.out.println("Total de descontos: " + totalDescontos);
		System.out.println("Sal�rio liquido:" + salarioLiquido);
		
		
		
		
		
		scan.close();
	}

}
