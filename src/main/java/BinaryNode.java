import java.util.List;

public class BinaryNode {

    Integer value;
    private BinaryNode smaller;
    private BinaryNode bigger;
    private BinaryNode parent;

    public BinaryNode(Integer value) {
        this.value = value;
    }

    public boolean compareData(BinaryNode other) {
        if(this.value.equals(other.value) &&
                ((this.smaller == null && other.smaller == null) || this.smaller.compareData(other.smaller) ) &&
                ((this.bigger == null && other.bigger == null) || this.bigger.compareData(other.bigger) )
        ) {
            return true;
        }
        return false;
    }

    public int size(){
        int sizeSmaller = (smaller != null) ? smaller.size() : 0;
        int sizeBigger = (bigger != null) ? bigger.size() : 0;
        return 1 + sizeSmaller + sizeBigger;
    }

    public Integer getValue(int index){
        BinaryNode node = getNode(index);
        return (node != null) ? node.value : null;
    }

    public BinaryNode getNode(int index) {
        if(index > this.size() - 1) {
            // exception out of borders
            return null;
        }
        BinaryNode currentNode = getFirstNode();
        for(int i=0; i<index; i++) {
            currentNode = currentNode.next();
        }
        return currentNode;
    }

    public BinaryNode next() {
        if(this.bigger != null){
            return this.bigger.getFirstNode();
        }else{
            return getNextByParent(this, this.parent);
        }
    }

    public BinaryNode getNextByParent(BinaryNode node, BinaryNode parent){
        if(parent != null) {
            if(parent.value > node.value){
                return parent;
            }else{
                if(parent.parent != null){
                    return getNextByParent(node, parent.parent);
                }
            }
        }
        return null;
    }

    public void setSmaller(BinaryNode smaller){
        this.smaller = smaller;
        if(smaller != null){
            smaller.parent = this;
        }
    }

    public void setBigger(BinaryNode bigger) {
        this.bigger = bigger;
        if(bigger != null) {
            bigger.parent = this;
        }

    }

    public BinaryNode getFirstNode() {
        BinaryNode currentNode = this;
        while (currentNode.hasSmaller()) {
            currentNode = currentNode.smaller;
        }
        return currentNode;
    }

    public boolean hasSmaller() {
        return this.smaller != null;
    }

    public String print() {
        StringBuilder sb = new StringBuilder();

        sb.append(" ( ");
        if(smaller != null) {
            sb.append(smaller.print());
        }
        sb.append(value);
        if(bigger != null) {
            sb.append(bigger.print());
        }
        sb.append(" ) ");
        return sb.toString();
    }

    @Override
    public String toString() {
        return "BinaryNode ("+ this.value +")";

    }

    public BinaryNode getSmaller() {
        return smaller;
    }

    public BinaryNode getBigger() {
        return bigger;
    }

    public BinaryNode getParent() {
        return parent;
    }
}