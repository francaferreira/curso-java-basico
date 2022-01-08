package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer22 {

	public static void main(String[] args) {
		/* Uma fruteira est� vendendo frutas com a seguinte tabela de pre�os:
                      At� 5 Kg           Acima de 5 Kg
           Morango         R$ 2,50 por Kg          R$ 2,20 por Kg
           Ma��            R$ 1,80 por Kg          R$ 1,50 por Kg
           Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra ultrapassar R$ 25,00, 
           receber� ainda um desconto de 10% sobre este total. Escreva um algoritmo para ler a quantidade (em Kg) 
           de morangos e a quantidade (em Kg) de ma�as adquiridas e escreva o valor a ser pago pelo cliente.*/
         
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite com a quatidade (Kg) de morango: ");
		double qtdMorango = scan.nextDouble();
		
		System.out.println("Digite com a quatidade (Kg) de ma�a: ");
		double qtdMaca = scan.nextDouble();
		
		double precoKgMorango = 0;
		if (qtdMorango <= 5) {
			precoKgMorango = 2.5;
		}else {
			precoKgMorango = 2.2;
		}
		
		double precoKgMaca = 0;
		if (qtdMaca <= 5) {
			precoKgMaca = 1.8;
		}else {
			precoKgMaca = 1.5;
		}
		
		double precoTotalMorango = qtdMorango * precoKgMorango;
		double precoTotalMaca = qtdMaca * precoKgMaca;
		
		double precoParcial = precoKgMorango + precoKgMaca;
		double precoTotal = precoParcial;
		
		if ((qtdMorango + qtdMaca > 8) || precoParcial > 25) {
			precoTotal = precoParcial - ((precoParcial / 100) * 10);
		}
		
		System.out.println("Pre�o total = " + precoTotal);
		
		scan.close();
	}

}
