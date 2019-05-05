package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Piece;
import ch.heig.gen.lab03.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GoSquareTest {

    @Test
    public void goSquareLandedOnWork() {
        Square go = new GoSquare();
        Piece piece = new Piece(go);

        Player player = new Player(piece, null);
        assertEquals(1500, player.getCash());
        piece.getLocation().landedOn(player);
        assertEquals(1700, player.getCash());
    }
}
