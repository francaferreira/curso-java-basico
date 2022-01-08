package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer04 {

	public static void main(String[] args) {
		// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("A letra é vogal ou consoante: ");
		String letra = scan.next();
		
		/*if (letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I") || 
			letra.equalsIgnoreCase("O") || letra.equalsIgnoreCase("U")) {
			System.out.println("Letra vogal");
		}else  {
			System.out.println("Consoante");
		}*/
		
		 scan.close();
         
		 if (letra.length() >1) {
			 System.out.println("Não é uma letra válida");
		 }else {
		 switch(letra) {
		 case "a":
		 case "e":
		 case "i":
		 case "o":
		 case "u":System.out.println("vogal");break;
		 default:System.out.println("Consoante");
		 }
		 }
	}

}
