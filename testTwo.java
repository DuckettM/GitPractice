import static org.junit.Assert.*;

public class testTwo {

    public void testInvalidInput() {
        int one = 5;
        String invalidInput = "abc";
        try {
            int two = Integer.parseInt(invalidInput); // Attempt to parse an invalid input
            fail("Expected NumberFormatException, but it was not thrown");
        } catch (NumberFormatException e) {
            // The program should throw a NumberFormatException when trying to parse "abc"
        }
    }
}
