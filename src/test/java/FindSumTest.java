import javafx.util.Pair;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class FindSumTest {

    @Test
    public void test9() {
        Assert.assertThat(FindSum.findSum(9, Arrays.asList(11, 2, 15, 7)),
                CoreMatchers.is(CoreMatchers.equalTo(new Pair<Integer, Integer>(1, 3))));
    }

    @Test
    public void test26() {
        Assert.assertThat(FindSum.findSum(26, Arrays.asList(11, 2, 15, 7)),
                CoreMatchers.is(CoreMatchers.equalTo(new Pair<Integer, Integer>(0, 2))));
    }

}
