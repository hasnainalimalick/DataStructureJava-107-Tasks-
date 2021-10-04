import java.util.Iterator;
import java.util.LinkedList;

public class DecendingItertorLL{
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(8);
        l.add(7);
        l.add(4);

        Iterator it = l.descendingIterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
