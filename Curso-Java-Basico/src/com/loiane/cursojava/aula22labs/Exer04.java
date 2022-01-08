package com.loiane.cursojava.aula22labs;

import java.util.Date;

public class Exer04 {

	public static void main(String[] args) {
		
		LivroDeBiblioteca livro = new LivroDeBiblioteca();
		
		livro.nome = "Masterring ExtJS";
		livro.autor = "Loiane Groner";
		livro.anoLancamento = 2015;
		
		livro.emprestadoNome = true;
		livro.dataEntrega = new Date();
		
		
		System.out.println("Nome do livro " + livro.nome);
		System.out.println("Nome do autor " + livro.autor);
		System.out.println("Lançamento do ano " + livro.anoLancamento);
		System.out.println("O livro esta emprestado " + livro.emprestadoNome);
		System.out.println("Data de entrega do livro " + livro.dataEntrega);

	}

}
