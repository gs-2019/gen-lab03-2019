package ch.heig.gen.lab03;

import java.util.concurrent.ThreadLocalRandom;

public class Die {

    private static final int SIDE_COUNT = 6;

    private int faceValue;

    public void roll() {
        this.faceValue = ThreadLocalRandom.current().nextInt(SIDE_COUNT) + 1;
    }

    public int getFaceValue() {
        return this.faceValue;
    }
}
