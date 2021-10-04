import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class JoinTwoLinkedList {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(2);
        l.add(5);

        LinkedList l2 = new LinkedList();
        l2.add(100);
        l2.add(102);
        l2.add(103);

        LinkedList join = new LinkedList();
        join.addAll(l);
        join.addAll(l2);
        System.out.println(join);
    }
}
