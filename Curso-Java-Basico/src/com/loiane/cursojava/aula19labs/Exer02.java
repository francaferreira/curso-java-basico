package com.loiane.cursojava.aula19labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		/* Criar um vetor A com 8 elementos inteiros. Construir um vetor B de mesmo tipo e 
		   tamanho e com os elementos do vetor A multiplicados por 2, ou seja: B[i] = A[i] * 2. */
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com valor da posição : " + i);
			vetorA[i] = scan.nextInt();
			
			vetorB[i] = vetorA[i] * 2;
		}
		
		System.out.print("VetorA ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		System.out.print("VetorB ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		System.out.println();
		
		scan.close();
	}

}
