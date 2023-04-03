package br.com.chesssistem.chess.entites.pieces;

import br.com.chesssistem.boardgame.entites.Board;
import br.com.chesssistem.chess.entites.ChessPiece;
import br.com.chesssistem.chess.enums.Color;

public class King extends ChessPiece{

    public King(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K"; 
    }
    
}
