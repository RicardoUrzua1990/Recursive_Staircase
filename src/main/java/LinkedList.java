import java.util.ArrayList;
import java.util.List;

public class LinkedList {

    Node head;

    public static boolean evaluateNode(Node node){
        List<Integer> records = new ArrayList<Integer>();
        do{
            if(records.contains(node.data)){
               return true;
            }
            node = node.next;
            records.add(node.data);
        }while(node.next != null);
        return false;
    }
}
