package br.com.chesssistem.chess.entites;

import br.com.chesssistem.boardgame.Board;


//Classe feita para representar a partida de xadrez
public class ChessMatch {
    
    private Board board;

    //classe automaticamente já implemneta o tamanho do tabuleiro quando 
    public ChessMatch() {
        board = new Board(8, 8);
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
}
