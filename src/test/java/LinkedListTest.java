import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class LinkedListTest {

    @Test
    public void testLoop01() {
        Node nodeD = new Node(4);
        Node nodeA = new Node(1, new Node(2, new Node(3, nodeD)));
        nodeD.next = nodeA;
        Assert.assertThat(LinkedList.evaluateNode(nodeA), CoreMatchers.equalTo(true));
    }
}
