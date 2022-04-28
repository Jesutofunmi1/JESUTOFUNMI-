package tdd.Chapter3;

import org.junit.jupiter.api.Test;
import tdd.Chapter3.Sum;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class sumTest {
    @Test
    public void testThatWeCanSum(){
        Sum sum = new Sum();
        sum.setSum(10,5);
        assertEquals(15,sum.getSum());
    }
}
