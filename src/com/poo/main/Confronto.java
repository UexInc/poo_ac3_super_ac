package com.poo.main;

import com.poo.supers.SuperHeroi;
import com.poo.supers.Vilao;

public class Confronto {
	
	// Comparador que verifica qual dos dois tem mais poder 
	public int lutar(SuperHeroi superheroi, Vilao vilao) {
		if (superheroi.getPoderTotal() > vilao.getPoderTotal())
			return 1; // Her�i ganhou
		else if(vilao.getPoderTotal() > superheroi.getPoderTotal())
			return 2; // Vil�o ganhou
		return 0; // Empate entre os dois
	}
	
}
