package ch.heig.gen.lab03;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class CupTest {

    @Test
    public void cupShouldReturnProperTotalValue() {

        // create a random number of dice
        ThreadLocalRandom random = ThreadLocalRandom.current();
        int maxDiceCount = random.nextInt(10);

        List<Die> dice = new ArrayList<>();
        for (int i = 0; i < maxDiceCount; i++) {
            Die die = new Die();
            dice.add(die);
        }

        // create a cup with the created dice and roll them
        Cup cup = new Cup(dice.toArray(new Die[] {}));
        cup.roll();

        // compute the total dice face value using the created list
        int diceTotal = 0;
        for (Die die : dice) {
            diceTotal += die.getFaceValue();
        }

        // assert that the total is equal to the one computed by the cup
        Assertions.assertEquals(diceTotal, cup.getTotal());
    }
}
