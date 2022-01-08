package com.loiane.cursojava.aula17labs;

import java.util.Scanner;

public class Exer02 {

	public static void main(String[] args) {
		/* Faça um programa que leia um nome de usuário e a sua senha e
		   não aceite a senha igual ao nome do usuário, mostrando uma 
		   mensagem de erro e voltando a pedir as informações.*/

		
		Scanner scan = new Scanner (System.in);
		
		boolean infoValidas = false;
		String nomeUser;
		String senha;
		
		do {
		
		System.out.println("Digite o seu nome do usuário: ");
		nomeUser = scan.next();
		
		System.out.println("Digite a sua senha: ");
		senha = scan.next();
		
		if (nomeUser.equalsIgnoreCase(senha)) {
			infoValidas = false;
			System.out.println("Senha igual a usuário, digite novamente.");
		}else {
			infoValidas = true;
			System.out.println("Senha e usuários válidos.");
		}
		
		}while (!infoValidas);
		
		scan.close();
	}

}
