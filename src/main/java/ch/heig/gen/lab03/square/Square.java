package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

import java.util.Objects;

public abstract class Square {

    private int position;

    public Square(int position) {
        this.position = position;
    }

    public abstract void landedOn(Player player);

    public int getPosition() {
        return this.position;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Square square = (Square) o;
        return position == square.position;
    }

    @Override
    public int hashCode() {
        return Objects.hash(position);
    }
}
