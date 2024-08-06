package chess;

import boardgame.Position;

public class ChessPosition {
    
    private char column;
    private int row;

    public ChessPosition(char columnm, int row){
        if (columnm < 'a' || columnm > 'h' || row < 1 || row > 8) {
            throw new ChessException("Error instantianing ChessPosition. Valid values are from a1 to h8");
        }
        this.column = columnm;
        this.row = row;
    }
    public char getColumn() {
        return column;
    }
    public int getRow() {
        return row;
    }
    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }
    protected static ChessPosition fromPosition(Position position){
        return new ChessPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return "" + column + row;
    }
}
