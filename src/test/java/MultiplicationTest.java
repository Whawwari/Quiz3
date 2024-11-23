import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MultiplicationTest {

    @Test
    void testMultiply() {
        assertEquals(0, Multiplication.multiply(0, 5), "0 multiplied by any number should be 0");
        assertEquals(0, Multiplication.multiply(5, 0), "Any number multiplied by 0 should be 0");
        assertEquals(20, Multiplication.multiply(4, 5), "4 * 5 should be 20");
        assertEquals(-20, Multiplication.multiply(-4, 5), "-4 * 5 should be -20");
        assertEquals(20, Multiplication.multiply(-4, -5), "-4 * -5 should be 20");
    }

    @Test
    void testMultiplyUsingLoop() {
        assertEquals(0, Multiplication.multiplyUsingLoop(0, 5), "0 multiplied by any number should be 0");
        assertEquals(0, Multiplication.multiplyUsingLoop(5, 0), "Any number multiplied by 0 should be 0");
        assertEquals(20, Multiplication.multiplyUsingLoop(4, 5), "4 * 5 should be 20");
        assertEquals(-20, Multiplication.multiplyUsingLoop(-4, 5), "-4 * 5 should be -20");
        assertEquals(20, Multiplication.multiplyUsingLoop(-4, -5), "-4 * -5 should be 20");
    }

    @Test
    void testMultiplyUsingShift() {
        assertEquals(0, Multiplication.multiplyUsingShift(0, 5), "0 multiplied by any number should be 0");
        assertEquals(0, Multiplication.multiplyUsingShift(5, 0), "Any number multiplied by 0 should be 0");
        assertEquals(20, Multiplication.multiplyUsingShift(4, 5), "4 * 5 should be 20");
        assertEquals(-20, Multiplication.multiplyUsingShift(-4, 5), "-4 * 5 should be -20");
        assertEquals(20, Multiplication.multiplyUsingShift(-4, -5), "-4 * -5 should be 20");
    }
}
