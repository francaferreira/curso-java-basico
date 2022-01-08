package com.loiane.cursojava.aula25labs;

public class Lampada {

	String modelo;
	String tensao;
	int potencia;
	String cor;
	String tipoLuz;
	int garantiaMeses;
	String[] tipos;
	boolean tipoAbajur;
    boolean ligada;

	void ligar() {
		ligada = true;
		
	}

	void desligar() {
		ligada = false;
	}

	void mostrarEstado() {
		if (ligada) {
			System.out.println("L�mpada est� ligada ");
		} else {
			System.out.println("L�mpada est� desligada ");
		}

	}
	
	void mudarEstado() {
		if (ligada) {
			desligar();
		}else {
			ligar();
		}
		
	}

}
