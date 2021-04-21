package com.poo.supers;

import com.poo.powers.SuperPoder;

public class Personagem {
	
	// Atributos
	private String nome;
	private String nomeVidaReal;
	private SuperPoder[] poderes;
	
	// Construtor
	public Personagem(String nome, String nomeVidaReal){
		this.nome = nome;
		this.nomeVidaReal = nomeVidaReal;
		this.poderes = new SuperPoder[4];
	}
	
	// Adiciona um novo poder ao vetor
	public void adicionarSuperPoder(SuperPoder superpoder){
		if (this.poderes.length <= 4){
			for (int i = 0; i < this.poderes.length; i++) {
				if (this.poderes[i] == null){
					// Quando achar um elemento null, adiciona e sai do laço
					this.poderes[i] = superpoder;
					break;
				}
			}
		}
	}
	
	// Retorna o poder total somando as categorias 
	public double getPoderTotal(){
		int total = 0;
		for (int i = 0; i < this.poderes.length; i++) {
			if(this.poderes[i] != null) // soma apenas se o elemento não for null
				total += this.poderes[i].getCategoria();
		}
		return total;
	}

	// Retorna o nome do personagem
	public String getNome() {
		return nome;
	}

	// Retorna o nome real do personagem
	public String getNomeVidaReal() {
		return nomeVidaReal;
	}
	
	// Retorna os poderes
	public SuperPoder[] getPoderes() {
		return poderes;
	}
}
