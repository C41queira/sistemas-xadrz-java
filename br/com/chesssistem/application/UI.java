package br.com.chesssistem.application;

import br.com.chesssistem.chess.entites.ChessPiece;

public class UI {

    //Verifica se há ou não uma peça em determinado ponto do tabuleiro 
    private static void printPiece(ChessPiece piece){
        if (piece == null) {
            System.out.print("-");
        }else{
            System.out.println(piece);
        }
        System.out.print(" ");
    }
    
    //Printa o tabuleiro inteiro no terminal 
    public static void printBoard(ChessPiece[][] pieces){

        //Percorre todas as linhas do tabuleiro  
        for(int l = 0; l < pieces.length; l++){
            System.out.print((8 - l) + " ");//Coloca os numeros das linhas 
            //percorre todas as colunas do tabuleiro
            for(int c = 0; c < pieces.length; c++){
                printPiece(pieces[l][c]);//para cada posição do tabuleiro, ira verificar se há ou não uma peça de xadrez
            }
            System.out.println();
        }

        System.out.println("  a b c d e f g h");
    }
}
