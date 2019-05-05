package ch.heig.gen.lab03;

import ch.heig.gen.lab03.square.GoSquare;
import ch.heig.gen.lab03.square.GoToJailSquare;
import ch.heig.gen.lab03.square.IncomeTaxSquare;
import ch.heig.gen.lab03.square.RegularSquare;
import ch.heig.gen.lab03.square.Square;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private static final int SQUARE_COUNT = 40;

    private final List<Square> squares;

    public Board() {

        squares = new ArrayList<>(SQUARE_COUNT);

        for (int i = 0; i < SQUARE_COUNT; i++) {

            if (i == Square.GO) {
                squares.add(new GoSquare());
            }
            else if (i == Square.INCOME_TAX) {
                squares.add(new IncomeTaxSquare());
            }
            else if (i == Square.GO_TO_JAIL) {
                squares.add(new GoToJailSquare());
            }

            squares.add(new RegularSquare(i));
        }
    }

    public Square getSquare(int position) {
        return getSquare(position, 0);
    }

    public Square getSquare(int position, int offset) {
        return squares.get((position + offset) % SQUARE_COUNT);
    }
}
