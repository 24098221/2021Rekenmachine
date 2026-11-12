import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void    aComputeAddTest() {
        JavaFXApp calculator =  new JavaFXApp();
        assertEquals(5, calculator.computeAdd(2, 3));
        assertEquals(-2, calculator.computeAdd(4, -6));
        assertEquals(0, calculator.computeAdd(-2, 2));
    }
    @Test
    void    aComputeMultiplyTest() {
        JavaFXApp calculator =  new JavaFXApp();
        assertEquals(6, calculator.computeMultiply(2, 3));
        assertEquals(-20, calculator.computeMultiply(-4, 5));
        assertEquals(0, calculator.computeMultiply(0, 5));
    }
    @Test
    void    aComputeDivideTest() {
        JavaFXApp calculator =  new JavaFXApp();
        assertEquals(5, calculator.computeDivide(10, 2));
        assertEquals(-3, calculator.computeDivide(-9, 3));
        assertEquals(0, calculator.computeDivide(0, 5));
    }
}