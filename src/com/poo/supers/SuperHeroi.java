package com.poo.supers;

import com.poo.powers.SuperPoder;

public class SuperHeroi extends Personagem {
	
	// Construtor
	public SuperHeroi(String nome, String nomeVidaReal) {
		super(nome, nomeVidaReal);
	}
	
	// Pega o poder total chamando o método da superclasse com mais 10%
	public double getPoderTotal() {
		double total = super.getPoderTotal();
		return total + (total * 0.1);
	}
	
	// Adiciona um novo poder chamando o método da superclasse
	public void adicionarSuperPoder(SuperPoder superpoder) {
		super.adicionarSuperPoder(superpoder);
	}
}
