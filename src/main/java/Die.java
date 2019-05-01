import java.util.Random;

public class Die {

    private int faceValue;

    public Die() {
        this.faceValue = 0;
    }

    public void roll() {
        // Generate a random number between 1-6
        Random rand = new Random();
        this.faceValue = rand.nextInt(6) + 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}
