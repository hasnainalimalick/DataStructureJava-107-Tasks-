import java.util.Iterator;
import java.util.TreeSet;

public class IterateTree {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(4);
        Iterator t = s.iterator();
        while (t.hasNext()) {
            System.out.println(t.next());
        }
    }
}
