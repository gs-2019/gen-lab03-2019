package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class IncomeTaxSquare extends Square {

    public static final String NAME = "Income Tax";

    public IncomeTaxSquare() {
        super(20, NAME);
    }

    @Override
    public void landedOn(Player player) {
        player.payTax();
    }
}
