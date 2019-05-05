package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class RegularSquare extends Square {

    public RegularSquare(int position) {
        super(position, "Square " + position);
    }

    @Override
    public void landedOn(Player player) {
        // do nothing
    }
}
