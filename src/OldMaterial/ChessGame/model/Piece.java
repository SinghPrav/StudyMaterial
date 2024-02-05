package OldMaterial.ChessGame.model;

import OldMaterial.ChessGame.moves.PossibleMovesProvider;

import java.util.List;

public class Piece {
   private boolean isKilled = false;
   private Color color;
   private List<PossibleMovesProvider> possibleMovesProviders;
   private Integer nullOfMoves = 0;

   private PieceType pieceType;

   public  PieceType getPieceType(){
       return pieceType;
   }

}
