package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class RegularSquare extends Square {

    public RegularSquare(int position) {
        super(position);
    }

    @Override
    public void landedOn(Player player) {

    }

    @Override
    public String toString() {
        return "Square " + super.getPosition();
    }
}
