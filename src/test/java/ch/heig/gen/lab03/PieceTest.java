package ch.heig.gen.lab03;

import ch.heig.gen.lab03.square.GoSquare;
import ch.heig.gen.lab03.square.Square;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class PieceTest {

    @Test
    public void pieceShouldReturnCorrectSquare() {

        Square square = new GoSquare();
        Piece piece = new Piece(square);

        Assertions.assertEquals(square, piece.getLocation());
    }
}
