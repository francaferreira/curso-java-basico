package com.loiane.cursojava.aula23;

import com.loiane.cursojava.aula23.Carro;

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
		
		van.exibirAutonomia();

	}

}
