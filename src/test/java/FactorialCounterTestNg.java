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
        Assert.assertEquals(counter.factorial(1), 1);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public void testFactorialWithNegativeNumber() {
        FactorialCounter.factorial(-1);
    }
}
