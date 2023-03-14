package Jogo_da_Velha;

//Bibliotecas
import java.util.*;


public class Jogo {
	private char Tabuleiro[][] = new char[3][3];
    private Jogador Joga[] = new Jogador[2];
    
    public Jogo(){
    	//Gerando Tabuleiro
    	for(int i = 0; i < 3; i++)
    		for(int k = 0; k < 3; k++) Tabuleiro[i][k] = '-';
    	
    	
    	//Gerando Jogadores
    	String Nome;
    	Scanner input = new Scanner(System.in);
    	
    	//Gera o primeiro jogador
    	System.out.print("Digite o nome do Jogador que será o \"X\": ");
    	Nome = input.nextLine();
    	Joga[0] = new Jogador(Nome, 'X');
    	
    	
    	//Gera o Segundo jogador
    	System.out.print("Digite o nome do Jogador que será o \"O\": ");
    	Nome = input.nextLine();
    	Joga[1] = new Jogador(Nome, 'O');
    }
    
    
	public char[][] getTabuleiro() { return Tabuleiro; }
	public Jogador[] getJoga() {return Joga;}
	
	public void setTabuleiro(char tabuleiro[][]) { Tabuleiro = tabuleiro; }
	public void setJoga(Jogador joga[]) { Joga = joga;}
	
}
