package chess;

public class King extends ChessFighre{
    public static int COUNTKING;
    public King(int x, int y){
        super(x,y);
        COUNTKING++;
    }
    @Override
    public void draw() {
        System.out.println("the king is created");
    }
}
