package com.loiane.cursojava.aula26;

public class TesteCarro {

	public static void main(String[] args) {
		
		Carro van = new Carro(null, null);
		van.marca = "Fiat";
		van.modelo = "Ducato";
		van.numPassageiros = 10;
		van.capCombustivel = 100;
		van.consumoCombustivel = 0.2;
		
		System.out.println(van.nunPassageiros);
		

		Carro van2 = new Carro("Fiat", "Ducato", 10, 100, 0.2, 0);
		
		System.out.println(van2.marca);
		System.out.println(van2.modelo);
		System.out.println(van2.numPassageiros);
		System.out.println(van2.capCombustivel);
		System.out.println(van2.consumoCombustivel);
		
		Carro2 carro2 = new Carro2();

	}

}
