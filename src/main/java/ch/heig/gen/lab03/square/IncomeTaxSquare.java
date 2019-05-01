package ch.heig.gen.lab03.square;

import ch.heig.gen.lab03.Player;

public class IncomeTaxSquare extends Square {

    public IncomeTaxSquare() {
        super(20);
    }

    @Override
    public void landedOn(Player player) {
        player.payTax();
    }

    @Override
    public String toString() {
        return "Income Tax";
    }
}
