package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class GoSquare extends Square {

    private static final String NAME = "Go";

    public GoSquare() {
        super(GO, NAME);
    }

    @Override
    public void landedOn(Player player) {
        player.addCash(200);
    }
}
