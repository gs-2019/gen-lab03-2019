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
        return name;
    }

    public void takeTurn(Die dice1, Die dice2) {

        dice1.roll();
        dice2.roll();
        int faceValue = dice1.getFaceValue() + dice2.getFaceValue();

        Square oldLocation = piece.getLocation();
        Square newLocation = game.getBoard().getSquare(oldLocation, faceValue);
        piece.setLocation(newLocation);

        System.out.println(String.format("%s advances %d ch.heig.gen.lab03.square%s", this, faceValue, faceValue == 1 ? "" : "s"));
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
