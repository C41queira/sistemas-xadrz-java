package br.com.chesssistem.application;

import java.util.InputMismatchException;
import java.util.Scanner;

import br.com.chesssistem.chess.entites.ChessPiece;
import br.com.chesssistem.chess.entites.ChessPosition;
import br.com.chesssistem.chess.enums.Color;

public class UI {

    // https://stackoverflow.com/questions/5762491/how-to-print-color-in-console-using-system-out-println

	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_BLACK = "\u001B[30m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	public static final String ANSI_PURPLE = "\u001B[35m";
	public static final String ANSI_CYAN = "\u001B[36m";
	public static final String ANSI_WHITE = "\u001B[37m";

	public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
	public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
	public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
	public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
	public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
	public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
	public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
	public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";


    public static ChessPosition readyChessPosition(Scanner sc){
        try {
            String s = sc.next();
            char column = sc.next().charAt(0); 
            int  row = Integer.parseInt(s.substring(1));
            return new ChessPosition(column, row); 
        } catch (RuntimeException e) {
            throw new InputMismatchException("ERROR reading ChessPosition. Valid values are from a1 to h8");
        }
        
    }

    //Verifica se há ou não uma peça em determinado ponto do tabuleiro 
    private static void printPiece(ChessPiece piece) {
    	if (piece == null) {
            System.out.print("- ");
        }else {
            if (piece.getColor() == Color.WHITE) {
                System.out.print((ANSI_WHITE + piece + ANSI_RESET) + " ");
            }
            else {
                System.out.print((ANSI_YELLOW + piece + ANSI_RESET) + " ");
            }
        }
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
