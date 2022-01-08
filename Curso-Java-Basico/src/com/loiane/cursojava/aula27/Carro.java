package com.loiane.cursojava.aula27;

public class Carro {

	String marca;
	String modelo;
	int nunPassageiros;
	double capCombustivel;
	double consumoCombustivel;
	public int numPassageiros;

	public Carro(String marca, String modelo, int nunPassageiros, double capCombustivel, double consumoCombustivel,
			int numPassageiros) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.nunPassageiros = nunPassageiros;
		this.capCombustivel = capCombustivel;
		this.consumoCombustivel = consumoCombustivel;
		this.numPassageiros = numPassageiros;
	}

	public Carro() {
	}

	public Carro(String marca, String modelo, int numPassageiros) {
		this.marca = marca;
		this.modelo = modelo;
		this.numPassageiros = numPassageiros;
		System.out.println(" Chamando o construtor com tr�s par�metros");
	}

	public Carro(String marca, String modelo) {
		this(marca, modelo, 10);
		System.out.println(" Chamando o construtor com dois par�metros");
	}

	void exibirAutonomia() {

		System.out.println("A autonomia do carro �: " + this.capCombustivel * this.consumoCombustivel + " Km ");

	}

	double obterAutonimia() {

		System.out.println("M�todo obterAutonomia foi chamado. ");
		return this.capCombustivel * this.consumoCombustivel;
	}

	double calcularCombustivel(double Km) {

		double qtdCombustivel = Km / this.consumoCombustivel;

		return qtdCombustivel;
	}

}
