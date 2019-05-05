package ch.heig.gen.lab03;

import ch.heig.gen.lab03.square.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class BoardTest {

    public static final int POSITION = 10;
    public static final int OFFSET = 5;
    public static final int EXPECTED = POSITION + OFFSET - 1;

    @Test
    public void testGetSquare() {
        Board board = new Board();
        Square square = board.getSquare(POSITION, OFFSET);
        Assertions.assertEquals(EXPECTED, square.getPosition());
    }
}
