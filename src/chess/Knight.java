package chess;

public class Knight extends ChessFighre {
    public static int COUNTKNIGHT;
    public Knight(int x, int y){
        super(x,y);
        COUNTKNIGHT++;
    }
    @Override
    public void draw() {
        System.out.println("the knight is created");
    }
}
