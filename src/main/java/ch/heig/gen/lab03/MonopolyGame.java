package ch.heig.gen.lab03;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class MonopolyGame {

    private static final Logger LOG = Logger.getLogger(MonopolyGame.class.getName());
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

        for (int i = 1; i <= MAX_TURN_COUNT; ++i) {
            playRound(i);
        }
    }

    private void playRound(int roundIndex) {

        LOG.info("==== Begin of turn " + roundIndex + " ====");

        for (Player player : players) {
            player.takeTurn(die1, die2);
        }
    }

    public Board getBoard() {
        return board;
    }
}
