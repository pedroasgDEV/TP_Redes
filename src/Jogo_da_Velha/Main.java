package Jogo_da_Velha;

import java.util.Scanner;

public class Main {
	public static void main(String args[]) {
		//Inicia o jogo
		Jogo jogo = new Jogo();
		boolean continua;
		String confirm;
		Scanner input = new Scanner(System.in);
		char jogada = 'X';
		
		//Começa a jogar
		do {
			while(jogo.venceu()) {
				jogo.fazer_jogada(jogada);
				if(jogada == 'X') jogada = 'O';
				else jogada = 'X';
			}
			do {
				System.out.print("Continuar(Y/N)? ");
				confirm = input.next();
			} while(confirm != "Y" && confirm != "N" );
			continua = (confirm == "Y");
		} while(continua);

		input.close();
	}
}

