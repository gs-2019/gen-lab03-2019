public class Piece {

    Square curPos;

    public Piece(){
        curPos = new Square(0);
    }

    public void changePos(int score){
        curPos = new Square(curPos.getPos()+score);
    }

    public Square getCurPos(){
        return this.curPos;
    }

}
