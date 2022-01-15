package ChessGame.model;

import ChessGame.contract.PlayerMove;
import ChessGame.exceptions.PieceNotFoundException;

import java.util.List;

public abstract class Player {
    List<Piece> pieceList;

    public Player(List<Piece> pieceList){
        this.pieceList = pieceList;
    }

    public Piece getPiece(PieceType pieceType){
        for(Piece piece: pieceList){
            if(pieceType == piece.getPieceType()){
                return piece;
            }
        }
         throw new PieceNotFoundException();
    }

    public abstract PlayerMove makeMove();
}
