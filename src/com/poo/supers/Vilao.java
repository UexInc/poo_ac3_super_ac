package com.poo.supers;

import com.poo.powers.SuperPoder;

/* Criação do vilão */
public class Vilao extends Personagem {
	
	// Atributos
	public int tempoDePrisao; 
	
	// Construtor
	public Vilao(String nome, String nomeVidaReal, int tempoDePrisao){
		// repasse de parametros para superclasse
		super(nome, nomeVidaReal);
		this.tempoDePrisao = tempoDePrisao;
	}
	
	// Pega o poder total chamando o método da superclasse
	public double getPoderTotal() {
		return super.getPoderTotal();
	}
	
	// Adiciona um novo poder chamando o método da superclasse
	public void adicionarSuperPoder(SuperPoder superpoder) {
		super.adicionarSuperPoder(superpoder);
	}
}
