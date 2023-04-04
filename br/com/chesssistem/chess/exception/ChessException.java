package br.com.chesssistem.chess.exception;

import br.com.chesssistem.boardgame.exceptions.Boardexception;

public class ChessException extends Boardexception {

    private static final long serialVersionUID = 1L; 

    public ChessException(String message) {
        super(message);
    }
    
}
