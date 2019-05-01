package ch.heig.gen.lab03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Cup {

    private final List<Die> dice = new ArrayList<>();

    public Cup(Die... dice) {
        this.dice.addAll(Arrays.asList(dice));
    }

    public void roll() {
        dice.forEach(Die::roll);
    }

    public int getTotal() {

        int total = 0;
        for (Die die : dice) {
            total += die.getFaceValue();
        }

        return total;
    }
}
