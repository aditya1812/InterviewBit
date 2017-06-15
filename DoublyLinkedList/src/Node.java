/**
 * Created by 5CB4125SDX0 on 09-05-2017.
 */
public class Node {
    private Node next;
    private Node prev;
    private int val;

    public Node(Node prev, Node next, int val) {
        this.next = next;
        this.prev = prev;
        this.val = val;
    }

    public Node() {
        this.next = null;
        this.prev = null;
        this.val = 0;
    }

    public Node getNext() {
        return next;
    }

    public Node getPrev() {
        return prev;
    }

    public int getVal() {
        return val;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public void setPrev(Node prev) {
        this.prev = prev;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
