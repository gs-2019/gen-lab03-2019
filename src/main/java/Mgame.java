import java.util.List;

public class Mgame {
    private Board board;
    private List<Player> players;
    private List<Die> dice;


    public Mgame(List<Die> dice, Board board){
        this.dice = dice;
        this.board = board;
    }
}
