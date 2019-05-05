package ch.heig.gen.lab03;

import java.util.concurrent.ThreadLocalRandom;

public class Die {

    private static final int SIDE_COUNT = 6;

    protected int faceValue;

    public void roll() {
        faceValue = ThreadLocalRandom.current().nextInt(SIDE_COUNT) + 1;
    }

    public int getFaceValue() {
        return faceValue;
    }
}
