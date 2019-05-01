public class Square {

    private int position;

    public Square(int position) {
        this.position = position;
    }

    public String toString() {

        if (position == 0) {
            return "GO";
        }

        return "Square " + position;
    }

    public int getPosition() {
        return this.position;
    }
}
