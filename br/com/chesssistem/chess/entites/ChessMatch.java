package br.com.chesssistem.chess.entites;

import br.com.chesssistem.boardgame.entites.Board;
import br.com.chesssistem.boardgame.entites.Piece;
import br.com.chesssistem.boardgame.entites.Position;
import br.com.chesssistem.chess.entites.pieces.King;
import br.com.chesssistem.chess.entites.pieces.Rook;
import br.com.chesssistem.chess.enums.Color;
import br.com.chesssistem.chess.exception.ChessException;


//Classe feita para representar a partida de xadrez
public class ChessMatch {
    
    private Board board;

    //classe automaticamente já implemneta o tamanho do tabuleiro quando 
    public ChessMatch() {
        board = new Board(8, 8);
        initialSetup();
    } 

    //Retorna uma matrix de peças de xadrez correspondentes a partida
    //Busca em todas as localizações da matrix as posições das peças de xadrez no tabuleiro 
    public ChessPiece[][] getPieces(){
        
        ChessPiece[][] mat = new ChessPiece[board.getRow()][board.getColumn()]; 
        
        //Percorre toda a matrix das peças de xadrez  
        for(int l=0; l < board.getRow(); l++){
            for(int c=0; c < board.getColumn(); c++){
                //Para cada posição da matrix implementa um board.piece, para ver se há uma peça em tal posição 
                mat[l][c] = (ChessPiece) board.piece(l, c); 
            }
        }
        return mat; 
    }

    public ChessPiece performeChessMove(ChessPosition sourPosition, ChessPosition targPosition){
        Position source = sourPosition.toPosition();
        Position target = targPosition.toPosition();

        validSourcePosition(source);

        Piece capturedPiece = makeMove(source, target);

        return (ChessPiece) capturedPiece; 
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source); 
        Piece capturedPiece = board.removePiece(target);
        board.placePiece(p, target);
        return capturedPiece; 
    }

    private void validSourcePosition(Position position){
        if (!board.thereIsAPiece(position)) {
            throw new ChessException("There no piece on source position");
        }
    }

    private void placeNewPiece(char column, int row, ChessPiece chessPiece){
        board.placePiece(chessPiece, new ChessPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('c', 1, new Rook(board, Color.WHITE));
        placeNewPiece('c', 2, new Rook(board, Color.WHITE));
        placeNewPiece('d', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 2, new Rook(board, Color.WHITE));
        placeNewPiece('e', 1, new Rook(board, Color.WHITE));
        placeNewPiece('d', 1, new King(board, Color.WHITE));

        placeNewPiece('c', 7, new Rook(board, Color.BLACK));
        placeNewPiece('c', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 7, new Rook(board, Color.BLACK));
        placeNewPiece('e', 8, new Rook(board, Color.BLACK));
        placeNewPiece('d', 8, new King(board, Color.BLACK));
    }
}
