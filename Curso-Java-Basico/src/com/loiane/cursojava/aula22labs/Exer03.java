package com.loiane.cursojava.aula22labs;

public class Exer03 {

	public static void main(String[] args) {
		
		
		LivroLivraria livro = new LivroLivraria();
		
		livro.nome = "Mastering ExtJS";
		livro.autor = "Loiane Groner"; 
		livro.anoLacamento = 2015;
		livro.preco = 63.39;
		
		System.out.println("Nome do livro = " + livro.nome);
		System.out.println("Nome do autor " + livro.autor);
		System.out.println("Lan�amento do livro " + livro.anoLacamento);
		System.out.println("Pre�o do livro " + livro.preco);

	}

}
