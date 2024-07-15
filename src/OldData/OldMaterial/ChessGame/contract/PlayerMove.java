package OldData.OldMaterial.ChessGame.contract;

import OldData.OldMaterial.ChessGame.model.Cell;
import OldData.OldMaterial.ChessGame.model.Piece;

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
