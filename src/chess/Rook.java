package chess;

public class Rook extends ChessFighre{
    public static int COUNTROOK;
    public Rook(int x, int y){
        super(x,y);
        COUNTROOK++;
    }
    @Override
    public void draw() {
        System.out.println("the rook is created");
    }
}
