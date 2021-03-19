package chess;

public class Bishop extends ChessFighre {
    public static int COUNTBISHOP;
    public Bishop(int x, int y){
        super(x,y);
        COUNTBISHOP++;
    }
    @Override
    public void draw() {
        System.out.println("the bishop is created");
    }
}
