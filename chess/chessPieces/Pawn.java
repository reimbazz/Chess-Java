package chess.chessPieces;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;
import chess.ChessPiece;
import chess.Color;

public class Pawn extends ChessPiece{
    private ChessMatch chessMatch;

    public Pawn(Board board, Color color, ChessMatch chessMatch){
        super(board, color);
        this.chessMatch = chessMatch;
    }

    @Override
    public boolean[][] possibleMoves(){
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        Position p = new Position(0, 0);

        if (getColor() == Color.WHITE) {
            p.setValues(position.getRow() -1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() - 2, position.getColumn());
            Position p2 = new Position(position.getRow() -1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                   mat[p.getRow()][p.getColumn()] = true;             
            }
            p.setValues(position.getRow() -1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() -1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }

            //EnPassant branco
            if (position.getRow() == 3) {
                Position esquerda = new Position(position.getRow(), position.getColumn() - 1);
                if (getBoard().positionExists(esquerda) && isThereOpponentPiece(esquerda) && getBoard().piece(esquerda) == chessMatch.getEnPassantVulnerable()) {
                    mat[esquerda.getRow() - 1][esquerda.getColumn()] = true;
                }
                
                Position direita = new Position(position.getRow(), position.getColumn() + 1);
                if (getBoard().positionExists(direita) && isThereOpponentPiece(direita) && getBoard().piece(direita) == chessMatch.getEnPassantVulnerable()) {
                    mat[direita.getRow() - 1][direita.getColumn()] = true;
                }
            }

        }else{
            p.setValues(position.getRow() +1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() + 2, position.getColumn());
            Position p2 = new Position(position.getRow() + 1, position.getColumn());
            if (getBoard().positionExists(p) && !getBoard().thereIsAPiece(p) && getBoard().positionExists(p2) && !getBoard().thereIsAPiece(p2) && getMoveCount() == 0) {
                   mat[p.getRow()][p.getColumn()] = true;             
            }
            p.setValues(position.getRow() +1, position.getColumn() - 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            p.setValues(position.getRow() +1, position.getColumn() + 1);
            if (getBoard().positionExists(p) && isThereOpponentPiece(p)) {
                mat[p.getRow()][p.getColumn()] = true;
            }
            //enpassant preto
            if (position.getRow() == 4) {
                Position esquerda = new Position(position.getRow(), position.getColumn() - 1);
                if (getBoard().positionExists(esquerda) && isThereOpponentPiece(esquerda) && getBoard().piece(esquerda) == chessMatch.getEnPassantVulnerable()) {
                    mat[esquerda.getRow() + 1][esquerda.getColumn()] = true;
                }
                
                Position direita = new Position(position.getRow(), position.getColumn() + 1);
                if (getBoard().positionExists(direita) && isThereOpponentPiece(direita) && getBoard().piece(direita) == chessMatch.getEnPassantVulnerable()) {
                    mat[direita.getRow() + 1][direita.getColumn()] = true;
                }
            }
        }

        return mat;
    }

    @Override
    public String toString(){
        return "P";
    }
}
