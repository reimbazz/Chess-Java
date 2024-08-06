package chess;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece extends Piece{
    private Color color;

    //contrutores
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    //get
    public Color getColor() {
        return color;
    }
}
