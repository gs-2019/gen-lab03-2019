import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MonopolyGame {

    private static final int MAX_TURN_COUNT = 20;

    private Board board;
    private List<Player> players;
    private Die dice1, dice2;

    public MonopolyGame(Die dice1, Die dice2, Board board, List<Player> players) {
        this.dice1 = dice1;
        this.dice2 = dice2;
        this.board = board;
        this.players = players;
    }

    public static void main(String[] args) {

        Board board = new Board();
        List<Player> players = new ArrayList<>();
        Die die1 = new Die();
        Die die2 = new Die();
        MonopolyGame game = new MonopolyGame(die1, die2, board, players);

        int playerCount = 0;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Select the number of players (2-8): ");

            try {
                playerCount = input.nextInt();
            }
            catch (InputMismatchException e) {
                playerCount = 0;
            }
        }
        while (playerCount < 2 || playerCount > 8);

        for (int i = 0; i < playerCount; ++i) {
            players.add(new Player(game, "Player " + (i + 1)));
        }

        game.play();
    }

    public void play() {

        for (int i = 0; i < MAX_TURN_COUNT; ++i) {

            System.out.println("==== Begin of turn " + (i + 1) + " ====");

            for (Player player : players) {
                player.takeTurn(dice1, dice2);
            }
        }
    }

    public Board getBoard() {
        return board;
    }
}


