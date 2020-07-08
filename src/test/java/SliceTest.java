import javafx.util.Pair;
import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SliceTest {

    @Test
    public void testSlice1() {
        Assert.assertThat(FindSlice.findSlice(Arrays.asList(11, 2, 5, 15, 7, 9, 1)),
                CoreMatchers.is(CoreMatchers.equalTo(new Pair<Integer, Integer>(1,3))));
    }

    @Test
    public void testSlice2() {
        Assert.assertThat(FindSlice.findSlice(Arrays.asList(1, 2, 3)),
                CoreMatchers.is(CoreMatchers.equalTo(new Pair<Integer, Integer>(0,2))));
    }
}
