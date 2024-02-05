package OldMaterial.ChessGame.contract;

import OldMaterial.ChessGame.model.Cell;
import OldMaterial.ChessGame.model.Piece;

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
