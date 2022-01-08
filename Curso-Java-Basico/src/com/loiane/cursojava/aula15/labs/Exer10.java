package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		/* Faça um Programa que pergunte em que turno você estuda. 
		   Peça para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		   Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
		   "Valor Inválido!", conforme o caso. */

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o turno que você vai estuda: ");
		String turno = scan.next();
		
		  switch (turno) {
		  case "m":
		  case "M":System.out.println("Bom Dia");break;
		  case "v":
		  case "V":System.out.println("Boa Tarde");break;
		  case "n":
		  case "N":System.out.println("Boa noite");break;
		  default: System.out.println("Valor Inválido!");
		  
		  scan.close();
		  
		  }
		  }
		  }
		
		
		
	
	


