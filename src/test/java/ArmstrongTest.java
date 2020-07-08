import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ArmstrongTest {

    @Test
    public void testArmstrong1() {
        Assert.assertThat(Armstrong.stringArmstrong(370), CoreMatchers.equalTo(true));
    }

    @Test
    public void testArmstrong2() {
        Assert.assertThat(Armstrong.stringArmstrong(127), CoreMatchers.equalTo(false));
    }

    @Test
    public void testArmstrong3() {
        Assert.assertThat(Armstrong.stringArmstrong(407), CoreMatchers.equalTo(true));
    }
}
