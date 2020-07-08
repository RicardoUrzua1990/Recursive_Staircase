import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class RomanNumTest {

    @Test
    public void testChange1395() {
        Assert.assertThat(String.valueOf(RomanNum.executeChange(1395)), CoreMatchers.equalTo("MCCCXCV"));
    }

    @Test
    public void testChange73() {
        Assert.assertThat(String.valueOf(RomanNum.executeChange(73)), CoreMatchers.equalTo("LXXIII"));
    }

    @Test
    public void testChange645() {
        Assert.assertThat(String.valueOf(RomanNum.executeChange(645)), CoreMatchers.equalTo("DCXLV"));
    }
}
