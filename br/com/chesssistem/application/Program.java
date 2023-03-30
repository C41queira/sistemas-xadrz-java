package br.com.chesssistem.application;

import br.com.chesssistem.chess.entites.ChessMatch;

public class Program{

    public static void main(String[] args) {
        
        ChessMatch cm = new ChessMatch(); 
        UI.printBoard(cm.getPieces());
    }
}