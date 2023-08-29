public class Node {
    int val;
    Node next = null;
    Node prev = null;

    Node(int val) {
        this.val = val;
    }

    Node(int val, Node next) {
        this.val = val;
        this.next = next;
    }
}
