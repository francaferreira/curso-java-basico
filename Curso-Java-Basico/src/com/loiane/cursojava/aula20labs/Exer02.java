package com.loiane.cursojava.aula20labs;

import java.util.Random;

public class Exer02 {

	public static void main(String[] args) {
		/*
		 * Gere e imprima uma matriz M 10x10 com valores aleatórios entre 0-9. Após isso
		 * indique qual é o maior e o menor valor da linha 5 e qual é o maior e o menor
		 * valor da coluna 7.
		 */

		int[][] numerosAleatorios = new int[10][10];

		Random numeroRandom = new Random();

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				numerosAleatorios[i][j] = numeroRandom.nextInt(9);
			}
		}

		for (int i = 0; i < numerosAleatorios.length; i++) {
			for (int j = 0; j < numerosAleatorios[i].length; j++) {
				System.out.print(numerosAleatorios[i][j] + " ");

			}
			System.out.println();
		}

		int maiorL5 = 0;
		int menorL5 = 10;
		int linha5 = 5;
		
		for (int i = 0; i < numerosAleatorios[linha5].length; i++) {
			if (numerosAleatorios[linha5][i] > maiorL5) {
				maiorL5 = numerosAleatorios[linha5][i];
			}
			if (numerosAleatorios[linha5][i] < menorL5) {
				menorL5 = numerosAleatorios[linha5][i];
			}
		}

		System.out.println("Maior valor da linha 5: " + maiorL5);
		System.out.println("Menor valor da linha 5: " + menorL5);

		int maiorCl7 = 0;
		int menorCl7 = 0;
		int coluna7 = 5;
		
		for (int i = 0; i < numerosAleatorios.length; i++) {
			if (numerosAleatorios[i][coluna7] > maiorCl7) {
				maiorCl7 = numerosAleatorios[i][coluna7];
			}
			if (numerosAleatorios[i][coluna7] < menorCl7) {
				menorCl7 = numerosAleatorios[i][coluna7];
			}
		}

		System.out.println("Maior valor da coluna 7: " + maiorCl7);
		System.out.println("Menor valor da coluna 7: " + menorCl7);

	}

}
