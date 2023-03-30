package br.com.chesssistem.chess.entites;

import br.com.chesssistem.boardgame.Board;
import br.com.chesssistem.boardgame.Piece;
import br.com.chesssistem.chess.enums.Color;

//Classe criada para representar as peças do xadrez   
public class ChessPiece extends Piece {
    
    private Color color;

    public ChessPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
    
}
