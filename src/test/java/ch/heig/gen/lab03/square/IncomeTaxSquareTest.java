package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Piece;
import ch.heig.gen.lab03.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IncomeTaxSquareTest {

    @Test
    public void incomeTaxSqaureLandedOnWork() {
        Square incomeTax = new IncomeTaxSquare();
        Piece piece = new Piece(incomeTax);

        Player player = new Player(piece, null);
        assertEquals(1500, player.getCash());
        piece.getLocation().landedOn(player);
        assertEquals(1300, player.getCash());
    }
}
