package com.loiane.cursojava.aula26;

public class Carro {
	
	String marca;
	String modelo;
	public int nunPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	public int numPassageiros;
	
	public Carro(String string, String string2) {
		System.out.println("Classe Carro foi instanciada ");
	     numPassageiros = 4;
	}
	
	Carro(String marca_, String modelo_, int nunPassageiros_, double capCombustivel_, double consumoCombustivel_, int numPassageiros_) {
		marca = marca_;
		modelo = modelo_;
		 int numPassageiros = numPassageiros_;
		 capCombustivel = capCombustivel_;
		 consumoCombustivel = consumoCombustivel_;
	}


	void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + capCombustivel * consumoCombustivel + " Km ");

	}
	
	double obterAutonimia() {
		
		System.out.println("Método obterAutonomia foi chamado. ");
		return capCombustivel * consumoCombustivel;
	}
	
	double calcularCombustivel(double Km) {
		
		double qtdCombustivel = Km/consumoCombustivel;
			
			return qtdCombustivel;
	}

}
