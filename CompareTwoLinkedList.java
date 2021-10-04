import java.util.LinkedList;

public class CompareTwoLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(3);
        l.add(3);

        LinkedList l2 = new LinkedList();
        l2.add(3);
        l2.add(3);
        l2.add(3);
        for (int i = 0; i < l.size(); i++) {
            if (l.get(i) == l2.get(i)) {
                System.out.println("true");
            } else System.out.println("false");
        }
    }
}
