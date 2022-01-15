package ChessGame.contract;

import ChessGame.model.Cell;
import ChessGame.model.Piece;

public class PlayerMove {
    Piece piece;
    Cell cell;

    public Piece getPiece() {
        return piece;
    }

    public Cell getCell() {
        return cell;
    }
}
