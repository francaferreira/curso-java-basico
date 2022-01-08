package com.loiane.cursojava.aula22labs;

public class Exer02 {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		
		livro.nome = "Mastering ExTS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor = " + livro.autor);
		System.out.println("Lançamento do livro = " + livro.anoLancamento);
	}

}
