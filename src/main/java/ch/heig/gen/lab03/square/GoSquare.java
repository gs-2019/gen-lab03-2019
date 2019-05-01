package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class GoSquare extends Square {

    public GoSquare() {
        super(0);
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }

    @Override
    public String toString() {
        return "Go";
    }
}
