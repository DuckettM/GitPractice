import static org.junit.Assert.*;
import org.junit.Test;

public class testOne {

    @Test
    public void testValidSum() {
        int one = 5;
        int two = 10;
        int expectedSum = one + two;
        int actualSum = sum.calculateSum(one, two);
        assertEquals(expectedSum, actualSum);
    }
}