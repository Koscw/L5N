package chess;

public abstract class ChessFighre implements Drawable{
    String name = getClass().getName();
    public int x,y;
    public ChessFighre(int x, int y ){
        draw();
        this.x=x;
        this.y=y;

    }

    @Override
    public String toString() {
        return "ChessFigure{" +
                "name='" + name + '\'' +
                ", x=" + x +
                ", y=" + y +
                '}';
    }
}
