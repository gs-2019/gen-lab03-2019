import square.Square;

public class Piece {

    private Square location;

    public Piece(Square location) {
        setLocation(location);
    }

    public void setLocation(Square location) {
        this.location = location;
    }

    public Square getLocation() {
        return location;
    }
}
