import java.util.ArrayList;

public class Square {
    private ArrayList<Piece> pieces;

    private String name;

    private int pos;

    Square(int pos){
        if(pos==0){
            this.name = "GO";
        }else {
            this.name = "Square" + (pos - 1);
        }
        this.pos = pos;
    }

    public String getName(){
        return this.name;
    }

    public int getPos(){
        return this.pos;
    }
}
