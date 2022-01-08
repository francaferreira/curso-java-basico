package com.loiane.cursojava.aula23;

public class Carro {
	
	String marca;
	String modelo;
	int nunPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	
	
	void exibirAutonomia() {
		
		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km ");
	}
			

}
