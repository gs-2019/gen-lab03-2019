package ch.heig.gen.lab03;

import java.util.ArrayList;
import java.util.List;

public class MonopolyGame {

    private static final int MAX_TURN_COUNT = 20;

    private final List<Player> players = new ArrayList<>();
    private Board board;
    private Die die1, die2;

    public MonopolyGame(int playerCount) {

        // create dice and board
        this.die1 = new Die();
        this.die2 = new Die();
        this.board = new Board();

        // create the players and add them to the list
        for (int i = 0; i < playerCount; i++) {
            players.add(new Player(this, "Player " + (i + 1)));
        }
    }

    public void play() {

        for (int i = 0; i < MAX_TURN_COUNT; ++i) {

            System.out.println("==== Begin of turn " + (i + 1) + " ====");

            for (Player player : players) {
                player.takeTurn(die1, die2);
            }
        }
    }

    public Board getBoard() {
        return board;
    }
}
