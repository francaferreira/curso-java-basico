package com.loiane.cursojava.aula28;

public class Carro {

	public String marca;
	String modelo;
	int nunPassageiros;
	double capCombustivel;
	private double consumoCombustivel;
	public int numPassageiros;

	public void exibirAutonomia() {

		System.out.println("A autonomia do carro é: " + this.capCombustivel * this.consumoCombustivel + " Km ");

	}

	public double obterAutonimia() {

		System.out.println("Método obterAutonomia foi chamado. ");
		return this.capCombustivel * this.consumoCombustivel;
	}
	
	private double divideKmPorConsumoCombustivel(double Km) {
		return Km/this.consumoCombustivel;
	}

	public double calcularCombustivel(double Km) {

		return this.divideKmPorConsumoCombustivel(Km);
	}

}
