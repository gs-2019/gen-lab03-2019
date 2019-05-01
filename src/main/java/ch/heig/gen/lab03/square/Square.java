package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public abstract class Square {

    private int position;

    public Square(int position) {
        this.position = position;
    }

    public abstract void landedOn(Player player);

    public int getPosition() {
        return this.position;
    }
}
