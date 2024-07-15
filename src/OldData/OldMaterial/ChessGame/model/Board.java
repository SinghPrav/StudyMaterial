package OldData.OldMaterial.ChessGame.model;

public class Board {
    private int boardSize;
    Cell[][] cells;


    public Board(int boardSize, Cell[][] cells) {
        this.boardSize = boardSize;
        this.cells = cells;
    }
}
