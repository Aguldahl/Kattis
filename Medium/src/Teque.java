import java.util.Scanner;

public class Teque {

    int size = 0;
    Node head = null;
    Node tail = null;

    public void push_back(int n) {
        Node newNode = new Node(n);
        if (size == 0) {
            head = newNode;
            tail = newNode;
            size++;
            return;
        }
        tail.next = newNode;
        tail = newNode;
        size++;
    }

    public void push_front(int n) {
        Node newNode = new Node(n);
        if (size == 0) {
            tail = newNode;
        }
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void push_middle(int n) {
        Node newNode = new Node(n);
        if(size == 0) {
            head = newNode;
            tail = newNode;
            return;
        }
        if (size==1) {

        }
        Node pointer = head;
        for (int i = 0; i < Math.floor((size + 1) / 2) - 1; i++) {
            pointer = pointer.next;
        }
        newNode.next = pointer.next;
        pointer.next = newNode;
        size++;
    }

    public int get(int index) {
        Node pointer = head;

        if (size == 1) {
            return head.val;
        }
        for (int i = 0; i < index; i++) {
            pointer = pointer.next;
        }
        return pointer.val;
    }
    public static void main(String[] args) {
        Teque t = new Teque();
        Scanner reader = new Scanner(System.in);
        int numberOfLoops = Integer.parseInt(reader.nextLine());
        for (int i = 0; i < numberOfLoops; i++) {
            String[] strArr = reader.nextLine().split(" ");

            if(strArr[0].equals("push_back")) {
                t.push_back(Integer.parseInt(strArr[1]));
            } else if (strArr[0].equals("push_front")) {
                t.push_front(Integer.parseInt(strArr[1]));
            } else if (strArr[0].equals("push_middle")) {
                t.push_middle(Integer.parseInt(strArr[1]));
            } else if (strArr[0].equals("get")) {
                System.out.println(t.get(Integer.parseInt(strArr[1])));
            }
        }
    }
}
