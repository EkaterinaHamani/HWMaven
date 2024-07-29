import org.example.FactorialCounter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialCounterTestNg {
    FactorialCounter counter = new FactorialCounter();


    @Test
    public void testFactorialWithZero() {
        Assert.assertEquals(counter.factorial(0), 1);
    }

    @Test
    public void testFactorialWithPositiveNumber() {
        Assert.assertEquals(counter.factorial(2), 2);
    }

    @Test
    public void testFactorialWithNegativeNumber() {
        try {
            counter.factorial(-1);
            Assert.fail("Предполагается IllegalArgumentException для отрицательного числа");
        } catch (IllegalArgumentException e) {

        }
    }
}
