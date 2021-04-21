package com.poo.main;

import com.poo.powers.SuperPoder;
import com.poo.supers.SuperHeroi;
import com.poo.supers.Vilao;

public class Principal {
	
	/*
	 * --------- Grupo ---------
	 *	Gabriel Marcondes � RA: 1903416
	 *	Geisa Pereira Souza � RA: 1903417
	 *	Raphael Oliveira � RA: 1902604
	 *	Ricardo Trovato � RA: 1903223
	 *	Willian Pestana � RA: 1902650
	 */
	
	/* Verifica cada her�i e vil�o para cada um se enfrentar */
	private static void lutas(SuperHeroi[] superherois, Vilao[] viloes) {
		for (SuperHeroi superHeroi : superherois) {
			for (Vilao vilao : viloes) {
				luta(superHeroi, vilao);
			}
			System.out.println();
		}
	}
	
	/* Coloca um her�i contra um vil�o para lutar */ 
	private static void luta(SuperHeroi superheroi, Vilao vilao) {
		Confronto confronto = new Confronto();
		if (confronto.lutar(superheroi, vilao) == 1) {
			System.out.println(superheroi.getNome() + " ganhou a luta contra " + vilao.getNome() + " !");
		} else if(confronto.lutar(superheroi, vilao) == 2) {
			System.out.println(vilao.getNome() + " ganhou a luta contra " + superheroi.getNome() + " !");
		} else {
			System.out.println("Empate entre " + superheroi.getNome() + " e " + vilao.getNome() + " !");
		}
	}
	
	public static void main(String[] args) {
		
		// Vetores 
		SuperHeroi[] v_super_herois = new SuperHeroi[6];
		Vilao[] v_viloes = new Vilao[4];

		/* Spider man */
		SuperHeroi homem_aranha = new SuperHeroi("Homem-Aranha", "Peter Park");
		
		// Adiciona poderes do heroi
		homem_aranha.adicionarSuperPoder(new SuperPoder("soltar teia", 3));
		homem_aranha.adicionarSuperPoder(new SuperPoder("andar em paredes", 2));
		homem_aranha.adicionarSuperPoder(new SuperPoder("sentido apurado", 1));
		
		// Posi��o do her�i no vetor		
		v_super_herois[0] = homem_aranha;
		
		/* Superman */			
		SuperHeroi super_homem = new SuperHeroi("Super-Homem", "Clark Kent");

		// Adiciona poderes do heroi		
		super_homem.adicionarSuperPoder(new SuperPoder("voar", 3));
		super_homem.adicionarSuperPoder(new SuperPoder("for�a", 5));
		super_homem.adicionarSuperPoder(new SuperPoder("vis�o de raio x", 4));
		super_homem.adicionarSuperPoder(new SuperPoder("sopro congelante", 4));
		
		// Posi��o do her�i no vetor
		v_super_herois[1] = super_homem;
		
		/* Capit�o America */
		SuperHeroi capitao_america = new SuperHeroi("Capit�o Am�rica", "Stevan Rogers");
		
		// Adiciona poderes do heroi
		capitao_america.adicionarSuperPoder(new SuperPoder("supersoldado", 3));
		capitao_america.adicionarSuperPoder(new SuperPoder("escudo", 3));
		
		// Posi��o do her�i no vetor
		v_super_herois[2] = capitao_america;

		/* The Flash */					
		SuperHeroi flash = new SuperHeroi("Flash", "Berry Allen");
		
		// Adiciona poder do heroi
		flash.adicionarSuperPoder(new SuperPoder("velocidade", 5));
		
		// Posi��o do her�i no vetor		
		v_super_herois[3] = flash;

		/* Iron man */					
		SuperHeroi homemdeferro = new SuperHeroi("Homem de Ferro", "Tony Stark");
		
		// Diciona poderes do heroi
		homemdeferro.adicionarSuperPoder(new SuperPoder("armadura", 4));
		homemdeferro.adicionarSuperPoder(new SuperPoder("dispositivos eletr�nicos", 2));
		
		// Posi��o do her�i no vetor
		v_super_herois[4] = homemdeferro;

		/* Mulher-Maravilha */			
		SuperHeroi mulher_maravilha = new SuperHeroi("Mulher-Maravilha", "Diana");
		
		// Adiciona poderes do heroi
		mulher_maravilha.adicionarSuperPoder(new SuperPoder("velocidade", 3));
		mulher_maravilha.adicionarSuperPoder(new SuperPoder("forca", 3));
		mulher_maravilha.adicionarSuperPoder(new SuperPoder("braceletes", 1));
		
		// Posi��o do her�i no vetor
		v_super_herois[5] = mulher_maravilha;
		
		/* Duende-Verde */		
		Vilao duende_verde = new Vilao("Duende-Verde", "Norman Osbourne", 3);
		
		// Adiciona poder do vil�o
		duende_verde.adicionarSuperPoder(new SuperPoder("for�a", 5));

		// Posi��o do vil�o no vetor
		v_viloes[0] = duende_verde;

		/* Lex Luthor */
		Vilao lex_luthor = new Vilao("Lex Luthor", "Lex Luthor", 2);

		// Adiciona poder do vil�o		
		lex_luthor.adicionarSuperPoder(new SuperPoder("mente agu�ada", 5));

		// Posi��o do vil�o no vetor
		v_viloes[1] = lex_luthor;

		/* Bizarro */
		Vilao bizarro = new Vilao("Bizarro", "Bizarro", 1);
		
		// Adiciona poderes do vil�o		
		bizarro.adicionarSuperPoder(new SuperPoder("voar", 3));
		bizarro.adicionarSuperPoder(new SuperPoder("for�a", 5));
		bizarro.adicionarSuperPoder(new SuperPoder("vis�o de raio x", 4));
		bizarro.adicionarSuperPoder(new SuperPoder("sopro congelante", 4));
		
		// Posi��o do vil�o no vetor
		v_viloes[2] = bizarro;
		
		/* Octopus */
		Vilao octopus = new Vilao("Octopus", "Otto Octavius", 5);
		
		// Adiciona poderes do vil�o		
		octopus.adicionarSuperPoder(new SuperPoder("tent�culos indestrut�veis", 5));
		octopus.adicionarSuperPoder(new SuperPoder("velocidade", 1));
		
		// Posi��o do vil�o no vetor
		v_viloes[3] = octopus;
		
		// Executa todas as simula��es de luta
		lutas(v_super_herois, v_viloes);
		
		System.out.println("-------------------------");
		
		// Verifica empate
		SuperHeroi heroi = new SuperHeroi("Super-Homem", "Clark Kent");
		heroi.adicionarSuperPoder(new SuperPoder("voar", 1));
		heroi.adicionarSuperPoder(new SuperPoder("vis�o raio x", 5));
		heroi.adicionarSuperPoder(new SuperPoder("for�a", 4));
		
		Vilao vilao = new Vilao("Lex Luthor", "Lex Luthor", 2);
		vilao.adicionarSuperPoder(new SuperPoder("influ�ncia", 2));
		vilao.adicionarSuperPoder(new SuperPoder("mente agu�ada", 5));
		vilao.adicionarSuperPoder(new SuperPoder("estrat�gia", 4));
		
		// Execu��o da simula��o de empate
		luta(heroi, vilao);
	}
	
}
