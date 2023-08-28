public class TequeTest {

    public static void main(String[] args) {
        Teque test = new Teque();
        test.push_front(3);
        test.push_front(4);
        test.push_front(7);
        test.push_front(1);
        test.push_middle(10);
        for (int i = 0; i < test.size; i++) {
            System.out.println(test.get(i));
        }
    }
}
