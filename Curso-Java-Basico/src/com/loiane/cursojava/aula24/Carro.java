package com.loiane.cursojava.aula24;

public class Carro {

	String marca;
	String modelo;
	int nunPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {

		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km ");

	}
	
	double obterAutonimia() {
		
		System.out.println("M�todo obterAutonomia foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}

}
