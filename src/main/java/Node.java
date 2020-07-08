public class Node {
    Node next;
    Integer data;

    public Node(Integer data){
        this.data = data;
    }
    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }


}
