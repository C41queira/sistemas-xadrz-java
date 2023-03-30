package br.com.chesssistem.boardgame;

public class Piece {
   
    protected Position position; 
    private Board board;
    
    //Somente boar pois inicialmente as peças não teram posição
    public Piece(Board board) {
        this.board = board;
        this.position = null; 
    }

    //Somente a classe e as subclasses poderam acessar a camada Boar(tabuleiro)
    protected Board getBoard() {
        return board;
    } 

}
