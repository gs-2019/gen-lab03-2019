package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class GoToJailSquare extends Square {

    private static final String NAME = "Go to Jail";

    public GoToJailSquare() {
        super(30, NAME);
    }

    @Override
    public void landedOn(Player player) {
        player.goToJail();
    }
}
