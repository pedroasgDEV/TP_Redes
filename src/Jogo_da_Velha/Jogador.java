package Jogo_da_Velha;

import java.util.*;

public class Jogador {
	private String Nome;
	private int Pontos;
	private char Sinal;
	
	public Jogador(String n, char s) {
		Nome = n;
		Pontos = 0;
		Sinal = s;
	}
	
	public void setNome(String n){ Nome = n; } 
	
	public void addPontos(){ Pontos++; }
	
	public void setSinal(char s){ Sinal = s;}
	
	public String getNome(){ return Nome; } 
	
	public int getPontos(){ return Pontos; }
	
	public char getSinal(){ return Sinal;}
	
	public void print() {
		System.out.println("Jogador " + Sinal + ": " + Nome);
		System.out.println("Pontos: " + Pontos);
	}
}
