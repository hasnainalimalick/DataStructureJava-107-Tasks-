import java.util.Collection;
import java.util.TreeSet;

public class CloneTreeSet {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(4);

        TreeSet clone = new TreeSet(s);
        System.out.println(clone);
    }
}
