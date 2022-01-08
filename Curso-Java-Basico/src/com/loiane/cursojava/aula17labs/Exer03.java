package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exer03 {

	public static void main(String[] args) {
		/* Faça um programa que leia e valide as seguintes informações: 
		   a. Nome: maior que 3 caracteres; 
		   b. Idade: entre 0 e 150; 
		   c. Salário: maior que zero; 
		   d. Sexo: 'f' ou 'm'; 
		   e. Estado Civil: 's', 'c', 'v', 'd';*/
		
		Scanner scan = new Scanner(System.in);
		
		boolean infoValida = false;
		String nome, sexo, estadoCivil;
		int idade;
		double salario;
		
		
		do {
		
		System.out.println("Digite um nome: ");
		nome = scan.next();
		
		if (nome.length() >= 3){
			infoValida = true;
		}else {
			System.out.println("Nome presisa no mínimo 3 caracteres.");
		}
		
		}while (!infoValida);
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite a idade: ");
			idade = scan.nextInt();
			
			if (idade >= 0 && idade <= 150){
				infoValida = true;
			}else {
				System.out.println("Idade precisa ser entre 0 e 150.");
			}
			
			}while (!infoValida);
		
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite o salário: ");
			salario = scan.nextDouble();
			
			if (salario > 0){
				infoValida = true;
			}else {
				System.out.println("Salário precisa ser maior que 0.");
			}
			}while (!infoValida);
		
		
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite o sexo: ");
			sexo = scan.next();
			
			if (sexo.equalsIgnoreCase("F") || sexo.equalsIgnoreCase("M")){
				infoValida = true;
			}else {
				System.out.println("Sexo precisa ser 'F' 0u 'M'.");
			}
			
			}while (!infoValida);
		
		
		infoValida = false;
		
		do {
			
			System.out.println("Digite o Estado Civil: ");
			estadoCivil = scan.next();
			
			if (estadoCivil.equalsIgnoreCase("S") || estadoCivil.equalsIgnoreCase("C") 
			    || estadoCivil.equalsIgnoreCase("V") || estadoCivil.equalsIgnoreCase("D")){
				infoValida = true;
			}else {
				System.out.println("Estado civil precisa ser 'S' , 'C' , 'V' ou 'D'. ");
			}
			
			}while (!infoValida);
		
		System.out.println("As seguintes informações foram coletadas: ");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Salário: " + salario);
		System.out.println("Sexo: " + sexo);
		System.out.println("Estado civil: " + estadoCivil);
		
		
		
		
		
		
		scan.close();

	}

}
