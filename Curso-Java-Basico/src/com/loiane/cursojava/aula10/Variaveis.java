package com.loiane.cursojava.aula10;

public class Variaveis {

	public static void main(String[] args) {
		
		// Convenção Java
		int idade = 10;
		String nome = "JEFFERSON";
		String nomeDoMeuCachorro = "BOBY";
		String ano2014;
		
		// Aceito, mas não utilizado
		int _idade;
		int $idade;
		
		
		// Não é convenção Java
		String nome_do_meu_cachorro;
		String NomeDoMeuCachorro;
		String nomeDoMeucachorro;
		
		idade = 26;
		
		System.out.println("Idade = " + idade);
		System.out.println("Nome = " + nome);
		System.out.println("Nome do meu cachorro " + nomeDoMeuCachorro);
		
		// Má prática
		int a = 10;
		String b = "mel";

	}

}
