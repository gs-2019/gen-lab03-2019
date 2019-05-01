package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class GoToJailSquare extends Square {

    public GoToJailSquare() {
        super(30);
    }

    @Override
    public void landedOn(Player player) {

    }

    @Override
    public String toString() {
        return "Go to Jail";
    }
}
