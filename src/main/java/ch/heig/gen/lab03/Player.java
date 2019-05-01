package ch.heig.gen.lab03;

import ch.heig.gen.lab03.square.Square;

public class Player {

    private final MonopolyGame game;
    private final Piece piece;
    private final String name;
    private int cash = 1500;

    public Player(MonopolyGame game, String name) {
        this.game = game;
        this.name = name;
        this.piece = new Piece(game.getBoard().getStart());
    }

    public String toString() {
        return String.format("%s [cash: %d]", name, cash);
    }

    public void takeTurn(Die die1, Die die2) {

        Cup cup = new Cup(die1, die2);
        cup.roll();
        int faceValue = cup.getTotal();

        Square oldLocation = piece.getLocation();
        Square newLocation = game.getBoard().getSquare(oldLocation, faceValue);
        piece.setLocation(newLocation);
        piece.getLocation().landedOn(this);

        System.out.println(String.format("%s advances %d square%s", this, faceValue, faceValue == 1 ? "" : "s"));
        System.out.println(String.format("%s is now on %s", this, piece.getLocation()));
    }

    public void payTax() {

        double tax = cash * 0.1;
        if (tax < 200) {
            tax = 200;
        }

        cash -= tax;
    }

    public void addCash(int cash) {
        this.cash += cash;
    }

    public void goToJail() {
        piece.setLocation(game.getBoard().getJail());
    }
}
