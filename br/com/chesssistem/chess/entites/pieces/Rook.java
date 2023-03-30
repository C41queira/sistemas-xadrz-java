package br.com.chesssistem.chess.entites.pieces;

import br.com.chesssistem.boardgame.Board;
import br.com.chesssistem.chess.entites.ChessPiece;
import br.com.chesssistem.chess.enums.Color;

public class Rook extends ChessPiece{

    public Rook(Board board, Color color) {
        super(board, color);
    }
    
    @Override
    public String toString() {
        return "R";
    }
}
