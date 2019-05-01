import square.Square;

public class Player {

    private final MonopolyGame game;
    private final Piece piece;
    private final String name;

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

        System.out.println(String.format("%s advances %d square%s", this, faceValue, faceValue == 1 ? "" : "s"));
        System.out.println(String.format("%s is now on %s", this, piece.getLocation()));
    }
}
