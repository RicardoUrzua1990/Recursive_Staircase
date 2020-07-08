import org.hamcrest.CoreMatchers;
import org.hamcrest.Matcher;
import org.hamcrest.core.IsEqual;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinaryTreeTest {
    @Test
    public void testSameTree() {

        //given
       List<Integer> input = Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6});
       //
       BinaryNode expectedOutput = new BinaryNode(3);
       BinaryNode node0 = new BinaryNode(0);
       BinaryNode node1 = new BinaryNode(1);
       BinaryNode node2 = new BinaryNode(2);
       BinaryNode node4 = new BinaryNode(4);
       BinaryNode node5 = new BinaryNode(5);
       BinaryNode node6 = new BinaryNode(6);
       expectedOutput.setSmaller(node1);
       expectedOutput.setBigger(node5);
       node1.setSmaller(node0);
       node1.setBigger(node2);
       node5.setSmaller(node4);
       node5.setBigger(node6);
       Assert.assertThat(BinaryTree.execute(input).compareData(expectedOutput), CoreMatchers.equalTo(true));
    }

   @Test
   public void testCollectValue() {
      BinaryNode binaryNode = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(4);
      BinaryNode node5 = new BinaryNode(5);
      BinaryNode node6 = new BinaryNode(6);
      binaryNode.setSmaller(node1);
      binaryNode.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.collectValues(binaryNode, new ArrayList<Integer>());
      Assert.assertTrue(result.contains(0));
      Assert.assertTrue(result.contains(1));
      Assert.assertTrue(result.contains(2));
      Assert.assertTrue(result.contains(3));
      Assert.assertTrue(result.contains(4));
      Assert.assertTrue(result.contains(5));
      Assert.assertTrue(result.contains(6));
      Assert.assertTrue(result.size() == 7);

   }

   @Test
   public void testConvert2ArrayAscend() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(4);
      BinaryNode node5 = new BinaryNode(5);
      BinaryNode node6 = new BinaryNode(6);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.convert2Array(binaryTree, true);
      Assert.assertTrue(result.get(0).equals(0));
      Assert.assertTrue(result.get(3).equals(3));
      Assert.assertTrue(result.get(5).equals(5));
   }

   @Test
   public void testConvert2ArrayDescend() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(4);
      BinaryNode node5 = new BinaryNode(5);
      BinaryNode node6 = new BinaryNode(6);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.convert2Array(binaryTree, false);
      Assert.assertTrue(result.get(0).equals(6));
      Assert.assertTrue(result.get(3).equals(3));
      Assert.assertTrue(result.get(5).equals(1));
   }

   @Test
   public void testAscendWitchConvertTree() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(4);
      BinaryNode node5 = new BinaryNode(5);
      BinaryNode node6 = new BinaryNode(6);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.convertBinaryTree(binaryTree, true, new ArrayList<Integer>());
      Assert.assertTrue(result.get(0).equals(0));
      Assert.assertTrue(result.get(3).equals(3));
      Assert.assertTrue(result.get(5).equals(5));
   }

   @Test
   public void testDescendWitchConvertTree() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(4);
      BinaryNode node5 = new BinaryNode(5);
      BinaryNode node6 = new BinaryNode(6);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.convertBinaryTree(binaryTree, false, new ArrayList<Integer>());
      Assert.assertTrue(result.get(0).equals(6));
      Assert.assertTrue(result.get(3).equals(3));
      Assert.assertTrue(result.get(5).equals(1));
   }

   @Test
   public void testCreateSubTree1() {
      BinaryNode binaryTree = new BinaryNode(4);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(5);
      BinaryNode node5 = new BinaryNode(6);
      BinaryNode node6 = new BinaryNode(7);
      BinaryNode node7 = new BinaryNode(10);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node7);
      node7.setSmaller(node6);
      List<Integer> result = BinaryTree.createSubTree(binaryTree);
      Assert.assertTrue(result.get(0).equals(4));
      Assert.assertTrue(result.get(1).equals(5));
      Assert.assertTrue(result.get(3).equals(7));
   }

   @Test
   public void testCreateSubTree2() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(7);
      BinaryNode node5 = new BinaryNode(8);
      BinaryNode node6 = new BinaryNode(11);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.createSubTree(binaryTree);
      Assert.assertTrue(result.get(0).equals(0));
      Assert.assertTrue(result.get(1).equals(1));
      Assert.assertTrue(result.get(3).equals(3));
   }

   @Test
   public void testCreateSubTreeWithoutList1() {
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(7);
      BinaryNode node5 = new BinaryNode(8);
      BinaryNode node6 = new BinaryNode(11);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      List<Integer> result = BinaryTree.createSubTreeWithoutList(binaryTree);
      Assert.assertTrue(result.get(0).equals(0));
      Assert.assertTrue(result.get(1).equals(1));
      Assert.assertTrue(result.get(3).equals(3));
   }

   @Test
   public void testSize() {
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(null);
      int result = binaryTree.size();
      Assert.assertTrue(result == 2);
   }

   @Test
   public void testGetNextByParent1() {
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(2);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      BinaryNode result = binaryTree.getNextByParent(node0, node0.getParent());
      Assert.assertEquals(node0.getParent(),result);
   }

   @Test
   public void testGetNextByParent2() {
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(2);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      BinaryNode result = binaryTree.getNextByParent(binaryTree, binaryTree.getParent());
      Assert.assertNull(result);
   }

   @Test
   public void testGetFirst1(){
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(2);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      Assert.assertTrue(binaryTree.getFirstNode().value == 0);
   }

   @Test
   public void testGetFirst2(){
      BinaryNode binaryTree = new BinaryNode(8);
      BinaryNode node0 = new BinaryNode(2);
      BinaryNode node1 = new BinaryNode(3);
      BinaryNode node2 = new BinaryNode(4);
      BinaryNode node4 = new BinaryNode(12);
      BinaryNode node5 = new BinaryNode(21);
      BinaryNode node6 = new BinaryNode(25);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      Assert.assertTrue(binaryTree.getFirstNode().value == 2);
   }

   @Test
   public void testNext1(){
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(2);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      Assert.assertTrue(binaryTree.next().value == 2);
   }

   @Test
   public void testNext2(){
      BinaryNode binaryTree = new BinaryNode(8);
      BinaryNode node0 = new BinaryNode(2);
      BinaryNode node1 = new BinaryNode(3);
      BinaryNode node2 = new BinaryNode(4);
      BinaryNode node4 = new BinaryNode(12);
      BinaryNode node5 = new BinaryNode(21);
      BinaryNode node6 = new BinaryNode(25);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);
      Assert.assertTrue(binaryTree.next().value == 12);
   }

   @Test
   public void testGetNode(){
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(3);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      Assert.assertTrue(binaryTree.getNode(2).value == 3);
   }

   @Test
   public void testGetNodeWithThree(){
      BinaryNode binaryTree = new BinaryNode(3);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(1);
      BinaryNode node2 = new BinaryNode(2);
      BinaryNode node4 = new BinaryNode(7);
      BinaryNode node5 = new BinaryNode(8);
      BinaryNode node6 = new BinaryNode(11);
      binaryTree.setSmaller(node1);
      binaryTree.setBigger(node5);
      node1.setSmaller(node0);
      node1.setBigger(node2);
      node5.setSmaller(node4);
      node5.setBigger(node6);

      BinaryNode result = binaryTree.getNode(3);

      Assert.assertNotNull(result);
      Assert.assertThat(result.value, IsEqual.equalTo(3));
   }

   @Test
   public void testGetValue(){
      BinaryNode binaryTree = new BinaryNode(1);
      BinaryNode node0 = new BinaryNode(0);
      BinaryNode node1 = new BinaryNode(3);
      binaryTree.setSmaller(node0);
      binaryTree.setBigger(node1);
      Assert.assertTrue(binaryTree.getValue(2) == 3);
   }

}
