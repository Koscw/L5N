package chess;

public class Pawn extends ChessFighre {
    public static int COUNTPAWNS;
    public Pawn(int x, int y){
        super(x,y);
        COUNTPAWNS++;
    }
    @Override
    public void draw() {
        System.out.println("the pawn is created");
    }
}
