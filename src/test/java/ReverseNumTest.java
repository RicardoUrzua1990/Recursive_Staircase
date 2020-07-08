import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ReverseNumTest {
    @Test
    public void testByIteration125() {
        Assert.assertThat(String.valueOf(ReverseNum.executeReverse(125)), CoreMatchers.equalTo("521"));
    }

    @Test
    public void testByIteration874() {
        Assert.assertThat(String.valueOf(ReverseNum.executeReverse(874)), CoreMatchers.equalTo("478"));
    }

    @Test
    public void testByIteration3571() {
        Assert.assertThat(String.valueOf(ReverseNum.executeReverse(3571)), CoreMatchers.equalTo("1753"));
    }
}
