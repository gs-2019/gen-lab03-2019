import square.GoSquare;
import square.GoToJailSquare;
import square.IncomeTaxSquare;
import square.RegularSquare;
import square.Square;

import java.util.ArrayList;
import java.util.List;

public class Board {

    public static final int SQUARE_COUNT = 40;

    private List<Square> squares;

    public Board() {

        squares = new ArrayList<>(SQUARE_COUNT);

        for (int i = 0; i < SQUARE_COUNT; i++) {
            if (i == 0) {
                squares.add(new GoSquare());
            }
            else if (i == 20) {
                squares.add(new IncomeTaxSquare());
            }
            else if (i == 30) {
                squares.add(new GoToJailSquare());
            }

            squares.add(new RegularSquare(i));
        }
    }

    public Square getSquare(Square square, int offset) {
        return squares.get((square.getPosition() + offset) % SQUARE_COUNT);
    }

    public Square getStart() {
        return squares.get(0);
    }
}
