package com.loiane.cursojava.aula17labs;



public class Exerc04 {

	public static void main(String[] args) {
		/* Supondo que a popula??o de um pa?s A seja da ordem de 80000 habitantes com uma taxa anual de 
		  crescimento de 3% e que a popula??o de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. 
		  Fa?a um programa que calcule e escreva o n?mero de anos necess?rios para que a popula??o do pa?s A 
		  ultrapasse ou iguale a popula??o do pa?s B, mantidas as taxas de crescimento. 
		 */

		//Scanner scan = new Scanner(System.in);
		int popA = 80000;
		int popB = 200000;
		int cont = 0;
		
		while (popA < popB) {
			
			popA += (popA/100) * 3;
			popB += (popB/100) * 1.5;
			cont ++;
		}
		
		System.out.println("Popula??o A: " + popA );
		System.out.println("Popula??o B: " + popB );
		System.out.println("Qtds anos:   " + cont);
	}

}
