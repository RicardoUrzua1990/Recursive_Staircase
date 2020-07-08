import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class PalindromeTest {
    @Test
    public void testPalindrome1() {
        Assert.assertThat(Palindrome.stringPalindrome("Alicia"), CoreMatchers.equalTo(false));
    }

    @Test
    public void testPalindrome2() {
        Assert.assertThat(Palindrome.stringPalindrome("123321"), CoreMatchers.equalTo(true));
    }

    @Test
    public void testPalindrome3() {
        Assert.assertThat(Palindrome.stringPalindrome("Bob"), CoreMatchers.equalTo(true));
    }

    @Test
    public void testPalindrome4() {
        Assert.assertThat(Palindrome.stringPalindrome("456782"), CoreMatchers.equalTo(false));
    }
}
