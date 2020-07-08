import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BinaryTree {

    BinaryNode root;

    public static void main(String[] args) {
        execute(Arrays.asList(new Integer[]{0, 1, 2, 3, 4, 5, 6}));
    }

    public static BinaryNode execute(List<Integer> input) {
        if (input.isEmpty()) {
            return null;
        }
        Integer indexValue = input.size() / 2;
        Integer value = input.get(indexValue);
        BinaryNode node = new BinaryNode(value);
        node.setSmaller(execute(input.subList(0, indexValue)));
        node.setBigger(execute(input.subList(indexValue + 1, input.size())));
        System.out.println(node.print());
        return node;
    }

    public static List<Integer> convert2Array(BinaryNode node, Boolean ascending) {
        List<Integer> list = new ArrayList<Integer>();
        // 1. collect values
        list = collectValues(node, list);
        // 2. sort list
        if (ascending == true) {
            Collections.sort(list);
        } else{
            Collections.reverse(list);
        }
        return list;
    }

    public static List<Integer> collectValues(BinaryNode node, List<Integer> list) {
        list.add(node.value);
        if (node.getSmaller() != null) {
            list = collectValues(node.getSmaller(), list);
        }
        if (node.getBigger() != null) {
            list = collectValues(node.getBigger(), list);
        }
        return list;
    }

    public static List<Integer> convertBinaryTree(BinaryNode node, Boolean ascending, List<Integer> list) {
        BinaryNode x = (ascending) ? node.getSmaller() : node.getBigger();
        BinaryNode y = (ascending) ? node.getBigger() : node.getSmaller();

        if (x != null) {
            convertBinaryTree(x, ascending, list);
        }
        list.add(node.value);
        if (y != null) {
            convertBinaryTree(y, ascending, list);
        }
        return list;
    }

    public static List<Integer> createSubTree(BinaryNode node) {
        List<Integer> inputTree = convertBinaryTree(node, true, new ArrayList<Integer>());
        List<Integer> newList = new ArrayList<Integer>();
        List<Integer> maxList = new ArrayList<Integer>();

        for (int i = 0; i < inputTree.size(); i++) {
            if(i == 0){
                newList.add(inputTree.get(i));
            }else {
                if(inputTree.get(i) - inputTree.get(i-1) == 1){
                    newList.add(inputTree.get(i));
                }else if(maxList.size() < newList.size()) {
                    maxList = newList;
                    newList = new ArrayList<Integer>();
                    newList.add(inputTree.get(i));
                }
            }
        }
        if (maxList.size() > newList.size()) {
            execute(maxList);
            return maxList;
        } else
            execute(newList);
        return newList;
    }

    public static List<Integer> createSubTreeWithoutList(BinaryNode inputTree) {
        List<Integer> newList = new ArrayList<Integer>();
        List<Integer> maxList = new ArrayList<Integer>();

        for (int i = 0; i < inputTree.size(); i++) {
            if(i == 0){
                newList.add(inputTree.getValue(i));
            }else {
                if(inputTree.getValue(i) - inputTree.getValue(i-1) == 1){
                    newList.add(inputTree.getValue(i));
                }else if(maxList.size() < newList.size()) {
                    maxList = newList;
                    newList = new ArrayList<Integer>();
                    newList.add(inputTree.getValue(i));
                }
            }
        }

        if (maxList.size() > newList.size()) {
            execute(maxList);
            return maxList;
        } else
            execute(newList);
        return newList;
    }
}

