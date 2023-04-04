package br.com.chesssistem.boardgame.entites;

import br.com.chesssistem.boardgame.exceptions.Boardexception;

public class Board {

    private int row; 
    private int column; 
    private Piece[][] pieces;
    
    public Board(int row, int column) {
        if (row < 1 || column < 1) {
            throw new Boardexception("ERROR creating Board: there must be at least 1 row and 1 colunm");
        }
        this.row = row;
        this.column = column;
        pieces = new Piece[row][column];
    }

    public int getRow() {
        return row;
    }

    public int getColumn() {
        return column;
    }

    //metodo implemnetado para falar as posições da peça no tabuleiro a partir da linha e da coluna
    public Piece piece(int row, int column){
        if (!positionExists(row, column)) {
            throw new Boardexception("Position not on the board");
        }
        return pieces[row][column]; 
    }

    
    //metodo implemnetado para falar as posições da peça no tabuleiro a partir da posição
    public Piece piece(Position position){
        return pieces[position.getRow()][position.getColumn()]; 
    }

    //Coloca a peça desejada na posição aplicada
    public void placePiece(Piece piece, Position position){
        if (thereIsAPiece(position)) {
            throw new Boardexception("There is alredy a piece on the position " + position);
        } 
        pieces[position.getRow()][position.getColumn()] = piece; 
        piece.position = position;
    }

    public boolean positionExists(int row, int column){
        return row >= 0 && row < this.row && column >= 0 && column < this.column;
    }

    public boolean positionExists(Position position){
        return positionExists(position.getRow(), position.getColumn());
    }

    public boolean thereIsAPiece(Position position){
        if (!positionExists(position.getRow(), position.getColumn())) {
            throw new Boardexception("Position not on the board");
        }
        return piece(position) != null; 
    }
}
