package com.poo.supers;

import com.poo.powers.SuperPoder;

/* Cria��o do vil�o */
public class Vilao extends Personagem {
	
	// Atributos
	public int tempoDePrisao; 
	
	// Construtor
	public Vilao(String nome, String nomeVidaReal, int tempoDePrisao){
		// repasse de parametros para superclasse
		super(nome, nomeVidaReal);
		this.tempoDePrisao = tempoDePrisao;
	}
	
	// Pega o poder total chamando o m�todo da superclasse
	public double getPoderTotal() {
		return super.getPoderTotal();
	}
	
	// Adiciona um novo poder chamando o m�todo da superclasse
	public void adicionarSuperPoder(SuperPoder superpoder) {
		super.adicionarSuperPoder(superpoder);
	}
}
