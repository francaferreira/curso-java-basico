package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer21 {

	public static void main(String[] args) {
		/* Um posto est� vendendo combust�veis com a seguinte tabela de descontos:
           �lcool:
           at� 20 litros, desconto de 3% por litro
           acima de 20 litros, desconto de 5% por litro
           Gasolina:
           at� 20 litros, desconto de 4% por litro
           acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o n�mero de litros vendidos,
           o tipo de combust�vel (codificado da seguinte forma: A-�lcool, G-gasolina), calcule e imprima o valor 
           a ser pago pelo cliente sabendo-se que o pre�o do litro da gasolina � R$ 2,50 o pre�o do litro do �lcool
           � R$ 1,90.*/
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite a qtd de litros vendidos");
		double litros = scan.nextDouble();
		
		System.out.println("Digite o tipo de combust�vel");
		String tipo = scan.next();
		
		double precoGas = 2.5;
		double precoAlc = 1.9;
		int percDesconto = 0;
		double total = 0;
		double totalDesc = 0;
		
	    if (tipo.equalsIgnoreCase("a")) {
	    	
	    	if (litros <= 20) {
	    		percDesconto = 3;
	    	}else {
	    		percDesconto = 5;
	    	}
	    	
	    	total = litros * precoAlc;
	    	
	    }else if (tipo.equalsIgnoreCase("g")) {
	    	
	    	if (litros <= 20) {
	    		percDesconto = 4;
	    	}else {
	    		percDesconto = 6;
	    	}
	    	
	    	total = litros * precoGas;
	    }
	    
	    totalDesc = (total / 100) * percDesconto;
	    
	     double precoAPagar = total - totalDesc;
	     
	     System.out.println("Valor ser pago: " + precoAPagar);
		
		
		scan.close();

	}

}
