package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exer05 {

	public static void main(String[] args) {
		/* Altere o programa anterior permitindo ao usu�rio informar as popula��es e as taxas de 
		   crescimento iniciais. Valide a entrada e permita repetir a opera��o. */

	
	
		 Scanner scan = new Scanner(System.in); {
			
			    double popA;
				double popB;
				double taxaA;
				double taxaB;
				
				boolean valido = false;
				do {
					System.out.println("Entre com a popula��o A: ");
					popA = scan.nextDouble();
					
					if (popA > 0) {
						valido = true;
					} else {
						System.out.println("Popula��o A precisar ser maior do 0.");
					}
					
				}while (!valido);
				
				
				valido = false;
				do {
					System.out.println("Entre com a popula��o B: ");
					popB = scan.nextDouble();
					
					if (popB > 0 ) {
						valido = true;
					} else {
						System.out.println("Popula��o B precisar ser maior do 0.");
					}
					
				}while (!valido);
				
				
				  valido = false;
					do {
						System.out.println("Entre com a taxa de crescimento da popula��o A: ");
						taxaA = scan.nextDouble();
						
						if (taxaA > 0) {
							valido = true;
						} else {
							System.out.println("Taxa de crescimento A precisar ser maior do 0.");
						}
						
					}while (!valido);
				
					
					 valido = false;
						do {
							System.out.println("Entre com a taxa de crescimento da popula��o B: ");
							taxaB = scan.nextDouble();
							
							if (taxaB > 0) {
								valido = true;
							} else {
								System.out.println("Taxa de crescimento B precisar ser maior do 0.");
							}
							
						}while (!valido);
			
				int cont = 0;
				
				while (popA < popB) {
					
					popA += (popA/100) * taxaA;
					popB += (popB/100) * taxaB;
					cont++;
				}
				
				System.out.println("Populala��o A: " + popA);
				System.out.println("Populala��o B: " + popB);
				System.out.println("Qtd anos: " + cont);
		}
			
}
}
