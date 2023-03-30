package br.com.chesssistem.boardgame;

public class Board {
    private int row; 
    private int column; 
    private Piece[][] pieces;
    
    public Board(int row, int column) {
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }

    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getColumn() {
        return column;
    }

    public void setColumn(int column) {
        this.column = column;
    } 

    //metodo implemnetado para falar as posições da peça no tabuleiro a partir da linha e da coluna
    public Piece piece(int row, int column){
        return pieces[row][column]; 
    }

    
    //metodo implemnetado para falar as posições da peça no tabuleiro a partir da posição
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()]; 
    }
}
