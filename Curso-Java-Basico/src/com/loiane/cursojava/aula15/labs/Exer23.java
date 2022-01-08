package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer23 {

	public static void main(String[] args) {
		/* O Hipermercado Tabajara está com uma promoção de carnes que é imperdível. Confira:
                      Até 5 Kg           Acima de 5 Kg
           File Duplo      R$ 4,90 por Kg          R$ 5,80 por Kg
           Alcatra         R$ 5,90 por Kg          R$ 6,80 por Kg
           Picanha         R$ 6,90 por Kg          R$ 7,80 por Kg
           Para atender a todos os clientes, cada cliente poderá levar apenas um dos tipos de carne da promoção, 
           porém não há limites para a quantidade de carne por cliente. Se compra for feita no cartão Tabajara o 
           cliente receberá ainda um desconto de 5% sobre o total da compra. Escreva um programa que peça o tipo
           e a quantidade de carne comprada pelo usuário e gere um cupom fiscal, contendo as informações da 
           compra: tipo e quantidade de carne, preço total, tipo de pagamento, valor do desconto e valor a pagar.*/

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o tipo de carne:");
		System.out.println("1 - File duplo");
		System.out.println("2 - Alcatra");
		System.out.println("3 - Picanha");
		int tipo = scan.nextInt();
		
		System.out.println("Digite com a quatidade (Kg):");
		double qtd = scan.nextDouble();
		
		double precoKg = 0;
		
		if (tipo == 1) {
			
			System.out.println(qtd + " Kg - File duplo");
			
			if (qtd < 5) {
				precoKg = 4.9;
			}else {
				precoKg = 5.9;
			}
			
		} else if (tipo == 2) {
			
			System.out.println(qtd + "Kg - Alcatra");
			
			if (qtd < 5) {
				precoKg = 5.9;
			} else {
				precoKg = 6.8;
			}
			
		} else if (tipo == 3) {
			
			System.out.println(qtd + "Kg - Picanha");
			
		   if (qtd < 5) {
			precoKg = 6.9;
		   } else {
			precoKg = 7.8;
		   }
		}
		
		double total = qtd * precoKg;
		System.out.println(qtd + "Kg * " + precoKg + "=" + total);
		
		System.out.println("Compra no cartão ? digite 1 para sim; ");
		int cartao = scan.nextInt();
		
		if (cartao == 1) {
			double desconto = (total / 110) * 5;
			System.out.println("Desconto de: " + desconto);
			System.out.println("Valor a pagar: " + (total - desconto));
		} else {
			System.out.println("Valor a pagar: " + total);
		}
		
		
		scan.close();
	}
}

