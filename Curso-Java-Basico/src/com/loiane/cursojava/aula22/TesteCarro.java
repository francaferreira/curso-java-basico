package com.loiane.cursojava.aula22;

public class TesteCarro {

	public static void main(String[] args) {
		
		
		Carro van = new Carro();
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.nunPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.marca);
		System.out.println(van.modelo);
		
		Carro fusca = new Carro();
		van.marca = "Volkswagen";
		van.modelo = "Fusca";
		van.nunPassageiros = 4;
		van.capCombustivel = 30;
		van.consumoCombustivel = 0.15;
		
		System.out.println(fusca.marca);
		System.out.println(fusca.modelo);

	}

}
