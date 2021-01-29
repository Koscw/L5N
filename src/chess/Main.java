package chess;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChessFighre bishop = new Bishop("2 to 3","3 and 7","bishop");
        ChessFighre king = new King("3 to 4","2 ","king");
        ChessFighre knight = new Knight("3 and 6","1 and 2","knight");
        ChessFighre pawn = new Knight("from 1 to 8","2and 6","pawn");
        ChessFighre quen = new Quen("5","3","queen");
        ChessFighre rook = new Rook("2 and 5","2and 4","rook");

        Drawable board= new ChessBoard();
        System.out.println(board.draw());

        List<ChessFighre> items = List.of( knight, quen,  king,rook ,bishop,pawn);
        System.out.println(items.toString());

    }
}
