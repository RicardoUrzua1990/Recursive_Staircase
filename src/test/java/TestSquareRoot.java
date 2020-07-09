import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class TestSquareRoot {

    @Test
    public void testSquareRoot25() {
        Assert.assertThat(String.valueOf(SquareRoot.squareRootInteger(25)), CoreMatchers.equalTo("5"));
    }

    @Test
    public void testSquareRoot64() {
        Assert.assertThat(String.valueOf(SquareRoot.squareRootInteger(64)), CoreMatchers.equalTo("8"));
    }

    @Test
    public void testSquareRoot100() {
        Assert.assertThat(String.valueOf(SquareRoot.squareRootInteger(100)), CoreMatchers.equalTo("10"));
    }
}
