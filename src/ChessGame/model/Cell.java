package ChessGame.model;

public class Cell {
    int x;
    int y;

    public Cell(int x, int y){
        this.x = x;
        this.y = y;
    }

    private Piece currentPiece;


    public Piece getCurrentPiece() {
        return currentPiece;
    }

    public void setCurrentPiece(Piece currentPiece) {
        this.currentPiece = currentPiece;
    }

    public boolean isFree(){
        return currentPiece == null;
    }
}
