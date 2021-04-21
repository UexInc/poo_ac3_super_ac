package com.poo.powers;

public class SuperPoder {
	
	// Atributos
	private String nome;
	private int categoria;
	
	// Construtor
	public SuperPoder(String nome, int categoria) {
		this.nome = nome;
		this.categoria = categoria;
	}

	// Retorna o nome do poder
	public String getNome() {
		return nome;
	}

	// Retorna a categoria
	public int getCategoria() {
		return categoria;
	}
}
