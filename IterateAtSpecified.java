import java.util.Iterator;
import java.util.LinkedList;

public class IterateAtSpecified {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(8);
        l.add(7);
        l.add(4);

        Iterator it = l.listIterator(1);
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
