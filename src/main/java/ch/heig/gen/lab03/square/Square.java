package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

import java.util.Objects;

public abstract class Square {

    public static final int GO = 0;
    public static final int JAIL = 10;
    public static final int INCOME_TAX = 20;
    public static final int GO_TO_JAIL = 30;

    private final int position;
    private final String name;

    public Square(int position, String name) {
        this.position = position;
        this.name = name;
    }

    public abstract void landedOn(Player player);

    public int getPosition() {
        return position;
    }

    @Override
    public String toString() {
        return name;
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
