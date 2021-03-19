package chess;

public class ChessBoard implements DrawBoard {
    public ChessBoard(){
        showBoard();
    }
    public static Object cell[] = new Object[16];
    @Override
    public void showBoard() {
        System.out.println("The board is created");
    }
}
