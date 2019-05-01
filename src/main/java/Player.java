public class Player {
    private Piece piece;
    private String name;
  
    Player(String name){
        this.name = name;
        this.piece = new Piece();
    }

    public void advancePce(int score){
        piece.changePos(score);
    }

    public String toString(){
        return name;
    }

    public Piece getPiece(){
        return piece;
    }
}
