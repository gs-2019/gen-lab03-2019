package ch.heig.gen.lab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class PlayerTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5 })
    public void testTakeTurn(int fv1) {

        Die d1 = new PippedDie(fv1);
        Die d2 = new PippedDie(fv1);

        MonopolyGame game = new MonopolyGame(2);
        Player player = game.getPlayers().get(0);
        player.takeTurn(d1, d2);

        Assertions.assertEquals(fv1 * 2 - 1, player.getPiece().getLocation().getPosition());
    }

    class PippedDie extends Die {

        private int pippedValue;

        public PippedDie(int pippedValue) {
            this.pippedValue = pippedValue;
        }

        public void roll() {
            faceValue = pippedValue;
        }
    }
}
