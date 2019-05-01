package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class RegularSquare extends Square {

    public RegularSquare(int position) {
        super(position);
    }

    @Override
    public void landedOn(Player player) {
        // do nothing
    }

    @Override
    public String toString() {
        return "Square " + super.getPosition();
    }
}
