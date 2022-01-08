package com.loiane.cursojava.aula19labs;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Exer09 {

	public static void main(String[] args) {
		/* Criar dois vetores A e B cada um com 10 elementos inteiros. Construir um vetor C, 
		   onde cada elemento de C é a divisão dos respectivos elementos em A e B, ou seja:
           C[i] = A[i] / float(B[i]). */
		
		Scanner scan = new Scanner(System.in);
		
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		double[] vetorC = new double[vetorA.length];
		
		
		for (int i=0; i<vetorA.length; i++) {
			System.out.println("Entre com o valor do vetor A da posição: ");
			vetorA[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<vetorB.length; i++) {
			System.out.println("Entre com o valor do vetor B da posição: ");
			vetorB[i] = scan.nextInt();
			
		}
		
		for (int i=0; i<vetorC.length; i++) {
			vetorC[i] = vetorA[i] / vetorB[i];
			
		}
		System.out.println();
		
		System.out.print("VetorA: ");
		for (int i=0; i<vetorA.length; i++) {
			System.out.print(vetorA[i] + " ");
			
		}
		System.out.println();
		
		System.out.print("VetorB: ");
		for (int i=0; i<vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
			
		}
		System.out.println();
		
		
		DecimalFormat df = new DecimalFormat("###,###.##");
	
		System.out.print("VetorC: ");
		for (int i=0; i<vetorC.length; i++) {
			System.out.print(vetorC[i] + " ");
			
		}
		System.out.println();
		
		
		df.clone();
		scan.close();
	}

}
