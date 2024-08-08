package chess;

import boardgame.Board;
import boardgame.Piece;
import boardgame.Position;

public abstract class ChessPiece extends Piece{
    private Color color;
    private int moveCount;

    //contrutores
    public ChessPiece(Board board, Color color){
        super(board);
        this.color = color;
    }

    //get
    public Color getColor() {
        return color;
    }
    public int getMoveCount() {
        return moveCount;
    }

    public void increaseMoveCount(){moveCount++;}

    public void decreseMoveCount(){moveCount--;}

    public ChessPosition getChessPosition(){
        return ChessPosition.fromPosition(position);
    }

    protected boolean isThereOpponentPiece(Position position){
        ChessPiece p = (ChessPiece) getBoard().piece(position);
        return p != null && p.getColor() != color;
    }
}
