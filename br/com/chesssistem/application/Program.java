package br.com.chesssistem.application;

import java.util.Scanner;

import br.com.chesssistem.chess.entites.ChessMatch;
import br.com.chesssistem.chess.entites.ChessPiece;
import br.com.chesssistem.chess.entites.ChessPosition;

public class Program{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        
        ChessMatch cm = new ChessMatch(); 

        while (true) {
            UI.printBoard(cm.getPieces());

            System.out.print("\nSource: ");
            ChessPosition source = UI.readyChessPosition(sc); 

            System.out.print("\nTarget: ");
            ChessPosition target = UI.readyChessPosition(sc); 

            ChessPiece capturPiece = cm.performeChessMove(source, target);
        }
        
    }
}