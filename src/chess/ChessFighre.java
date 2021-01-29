package chess;

public abstract class ChessFighre {
    private String x;
    private String y;
    private String value;
    public ChessFighre(String x, String y , String value){
        this.x=x;
        this.y=y;
        this.value=value;
    }
    @Override
    public String toString(){
        return "ChessFighre{" +
                "x = "+x+" y = "+y+" value= "+value;

    }
}
