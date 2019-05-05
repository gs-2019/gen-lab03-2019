package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.MonopolyGame;
import ch.heig.gen.lab03.Piece;
import ch.heig.gen.lab03.Player;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GoToJailSquareTest {

    @Test
    public void GoToJailSquareLandedOnWork(){
        MonopolyGame game = new MonopolyGame(1);
        Piece piece = new Piece(game.getBoard().getJail());
        Player player = new Player(piece, game);

        piece.getLocation().landedOn(player);
        assertTrue(game.getBoard().getJail().equals(player.getPiece().getLocation()));
    }

}