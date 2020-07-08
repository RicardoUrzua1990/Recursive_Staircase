import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class ReverseStringTest {
    @Test
    public void testByRecursion1() {
        Assert.assertThat(ReverseString.reverseAString("Ricardo"), CoreMatchers.equalTo("odraciR"));
    }

    @Test
    public void testByRecursion2() {
        Assert.assertThat(ReverseString.reverseAString("Jorge"), CoreMatchers.equalTo("egroJ"));
    }

    @Test
    public void testByRecursion3() {
        Assert.assertThat(ReverseString.reverseAString("Alicia"), CoreMatchers.equalTo("aicilA"));
    }
}
