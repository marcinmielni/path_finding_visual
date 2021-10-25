package data;

public class Spot {

    public enum Type{
        NORMAL,
        START,
        FINNISH
    }
    //private int x, y;
    private boolean closed;
    private boolean accessible;
    private Type type;

    public Spot(){
       this.closed = false;
       this.accessible = true;
       this.type = Type.NORMAL;
    }

    public void makeStart(){
        this.type = Type.START;
    }

    public void makeFinnish(){
        this.type = Type.FINNISH;
    }

    public void makeInaccessible(){
        this.accessible = false;
    }

    public void makeClosed(){
        this.closed = true;
    }
}
