import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @RepeatedTest(1000)
    public void testRangeDice(){
        Die d1 = new Die();
        d1.roll();
        assertTrue(d1.getFaceValue() <= 6 && d1.getFaceValue() >= 1);
    }
}
