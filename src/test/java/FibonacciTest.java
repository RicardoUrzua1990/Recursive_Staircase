import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciTest {
    /*
    @Test
    public void testByIteration3() {
        Assert.assertThat(Fibonacci.executeByIteration(3), CoreMatchers.equalTo("1 1 2"));
    }

    @Test
    public void testByIteration5() {
        Assert.assertThat(Fibonacci.executeByIteration(5), CoreMatchers.equalTo("1 1 2 3 5"));
    }

    @Test
    public void testByIteration08() {
        Assert.assertThat(Fibonacci.executeByIteration(8), CoreMatchers.equalTo("1 1 2 3 5 8 13 21"));
    }*/

    @Test
    public void testByRecursion1() {
        Assert.assertThat(Fibonacci.executeByRecursion(1, null), CoreMatchers.equalTo(new Integer[]{1}));
    }

    @Test
    public void testByRecursion2() {
        Assert.assertThat(Fibonacci.executeByRecursion(2, null), CoreMatchers.equalTo(new Integer[]{1, 1}));
    }

    @Test
    public void testByRecursion3() {
        Assert.assertThat(Fibonacci.executeByRecursion(3, null), CoreMatchers.equalTo(new Integer[]{1, 1, 2}));
    }

    @Test
    public void testByRecursion7() {
        Assert.assertThat(Fibonacci.executeByRecursion(7, null), CoreMatchers.equalTo(new Integer[]{1, 1, 2, 3, 5, 8, 13}));
    }

    @Test
    public void testByRecursion8() {
        Assert.assertThat(Fibonacci.executeByRecursion(8, null), CoreMatchers.equalTo(new Integer[]{1, 1, 2, 3, 5, 8, 13, 21}));
    }

}
