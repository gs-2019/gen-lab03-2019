import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {

    @RepeatedTest(1000)
    public void testRangeDice(){
        Die d1 = new Die();
        d1.throwDie();
        assertTrue(d1.getValue() <= 6 && d1.getValue() >= 1);
    }
}