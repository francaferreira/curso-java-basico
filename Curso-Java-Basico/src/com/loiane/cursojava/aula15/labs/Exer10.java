package com.loiane.cursojava.aula15.labs;

import java.util.Scanner;

public class Exer10 {

	public static void main(String[] args) {
		/* Fa�a um Programa que pergunte em que turno voc� estuda. 
		   Pe�a para digitar M-matutino ou V-Vespertino ou N- Noturno. 
		   Imprima a mensagem "Bom Dia!", "Boa Tarde!" ou "Boa Noite!" ou 
		   "Valor Inv�lido!", conforme o caso. */

		
		Scanner scan = new Scanner (System.in);
		
		System.out.println("Digite o turno que voc� vai estuda: ");
		String turno = scan.next();
		
		  switch (turno) {
		  case "m":
		  case "M":System.out.println("Bom Dia");break;
		  case "v":
		  case "V":System.out.println("Boa Tarde");break;
		  case "n":
		  case "N":System.out.println("Boa noite");break;
		  default: System.out.println("Valor Inv�lido!");
		  
		  scan.close();
		  
		  }
		  }
		  }
		
		
		
	
	


