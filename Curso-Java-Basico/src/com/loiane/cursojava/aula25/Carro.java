package com.loiane.cursojava.aula25;

public class Carro {
	
	String marca;
	String modelo;
	int numPassageiros;
	double capCombustivel;
	double consumoCombustivel;

	void exibirAutonomia() {

		System.out.println("A autonomia do carro �: " + capCombustivel * consumoCombustivel + " Km ");

	}
	
	double obterAutonimia() {
		
		System.out.println("M�todo obterAutonomia foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double Km) {
		
		double qtdCombustivel = Km/consumoCombustivel;
			
			return qtdCombustivel;
	}

}
