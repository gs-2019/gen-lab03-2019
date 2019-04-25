import java.util.ArrayList;
import java.util.Scanner;

public class Mgame {
    private Die dice1, dice2;

    Board board;

    ArrayList<Player> players;

    Mgame(Die dice1, Die dice2 , Board board, ArrayList<Player> players){

        this.dice1= dice1;
        this.dice2 = dice2;
        this.board = board;
        this.players = players;
    }

    public void play(){
        int nbturn = 20;
        int score = 0;
        for(int i = 0 ; i < nbturn ; ++i){
            System.out.println("====Begin of turn"+(i+1)+" ====");
            for(Player p : players){

                dice1.throwDie();
                dice2.throwDie();
                score = dice1.getValue() + dice2.getValue();
                System.out.println("The player "+p+" advances "+score+" square");
                p.advancePce(score);

                System.out.println("The player "+p+" is now on "+p.getPiece().getCurPos().getName());
            }


        }
    }

    public static void main(String[] args) {



        Die dice1 = new Die();
        Die dice2 = new Die();
        Board board = new Board();
        ArrayList<Player> players = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Select the number of players (2-8): ");
        int nbPlayer = input.nextInt();

        for(int i = 0 ; i < nbPlayer ; ++i){
            players.add(new Player("Player"+(i+1)));
        }

        Mgame game = new Mgame(dice1,dice2,board,players);

        game.play();

    }
}


