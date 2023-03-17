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
    	Joga[0] = new Jogador(Nome,'X');
    	
    	
    	//Gera o Segundo jogador
    	System.out.print("Digite o nome do Jogador que será o \"O\": ");
    	Nome = input.nextLine();
    	Joga[1] = new Jogador(Nome, 'O');

		input.close();
    }
    
    //Geters
	public char[][] getTabuleiro() { return Tabuleiro; }
	public Jogador[] getJoga() {return Joga;}
	
	//Seters
	public void setTabuleiro(char tabuleiro[][]) { Tabuleiro = tabuleiro; }
	public void setJoga(Jogador joga[]) { Joga = joga;}
	
	public boolean venceu(){
		//Verifica horizontalmente
		for(int i = 0; i < 3; i++)
			if(Tabuleiro[i][0] == Tabuleiro[i][1] && Tabuleiro[i][0] == Tabuleiro[i][2] && Tabuleiro[i][0] != '-')
				for(Jogador j : Joga) 
					if(j.getSinal() == Tabuleiro[i][0]){
						j.addPontos();
						System.out.println("O jogador \"" + j.getSinal() + "\" venceu" );
						return true;
					}
		
		//Verifica verticalmente
		for(int i = 0; i < 3; i++)
			if(Tabuleiro[0][i] == Tabuleiro[1][i] && Tabuleiro[0][i] == Tabuleiro[2][i] && Tabuleiro[0][i] != '-')
				for(Jogador j : Joga) 
					if(j.getSinal() == Tabuleiro[0][i]){
						j.addPontos();
						System.out.println("O jogador \"" + j.getSinal() + "\" venceu" );
						return true;
					}
		
		//Verifica diagonal principal
		if(Tabuleiro[0][0] == Tabuleiro[1][1] && Tabuleiro[0][0] == Tabuleiro[2][2] && Tabuleiro[0][0] != '-')
			for(Jogador j : Joga) 
				if(j.getSinal() == Tabuleiro[0][0]){
					j.addPontos();
					System.out.println("O jogador \"" + j.getSinal() + "\" venceu" );
					return true;
				}
		
		//Verifica diagonal secundaria
		if(Tabuleiro[0][2] == Tabuleiro[1][1] && Tabuleiro[0][2] == Tabuleiro[2][0] && Tabuleiro[0][2] != '-')
			for(Jogador j : Joga) 
				if(j.getSinal() == Tabuleiro[0][2]){
					j.addPontos();
					System.out.println("O jogador \"" + j.getSinal() + "\" venceu" );
					return true;
				}
		
		return false;
		
	}
	
	public void restart(){
		for(int i = 0; i < 3; i++)
    		for(int k = 0; k < 3; k++) Tabuleiro[i][k] = '-';
	}
	
	public void fazer_jogada(char s) {
		Scanner input = new Scanner(System.in);
		int i, j;
		boolean erro;
		
		do {
			System.out.print("Digie uma cordenada jogador \"" + s + "\":");
			i = input.nextInt();
			j = input.nextInt();
			//Verifica se houve erro na entrada
			erro = (i > 2 || i < 0 || j > 2 || j < 0 || Tabuleiro[i][j] != '-'); 
			if(erro) System.out.println("Opção invalida digite novamente");
		} while(erro);
		
		//Marca no tabuleiro
		Tabuleiro[i][j] = s;
		input.close();
	}
	
	public void print() {
		System.out.println("________________");
		System.out.println("| " + Tabuleiro[0][0] + " | " +  Tabuleiro[0][1] + " | " + Tabuleiro[0][2] + " |");
		System.out.println("________________");
		System.out.println("| " + Tabuleiro[1][0] + " | " +  Tabuleiro[1][1] + " | " + Tabuleiro[1][2] + " |");
		System.out.println("________________");
		System.out.println("| " + Tabuleiro[2][0] + " | " +  Tabuleiro[2][1] + " | " + Tabuleiro[2][2] + " |");
		System.out.println("________________");
		System.out.println();
		Joga[0].print();
		System.out.println();
		Joga[1].print();
		System.out.println();
	}
}
