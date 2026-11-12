import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class JavaFXAppTest {
    @Test
    void    aComputeAddTest() {
        JavaFXApp calculator =  new JavaFXApp();
        assertEquals(5, calculator.computeAdd(2, 3));
        assertEquals(10, calculator.computeAdd(4, 6));
        assertEquals(0, calculator.computeAdd(-2, 2));
    }
    @Test
    void    aComputeMultiplyTest() {
        JavaFXApp calculator =  new JavaFXApp();
        assertEquals(6, calculator.computeMultiply(2, 3));
        assertEquals(20, calculator.computeMultiply(4, 5));
        assertEquals(0, calculator.computeMultiply(0, 5));
    }
}