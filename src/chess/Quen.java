package chess;

public class Quen extends ChessFighre{

        public static int COUNTQUEEN;
    public Quen(int x, int y){
            super(x,y);
            COUNTQUEEN++;
        }
        @Override
        public void draw() {
            System.out.println("the queen is created");
        }
    }

