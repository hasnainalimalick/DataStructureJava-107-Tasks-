import java.util.HashSet;
import java.util.Iterator;

public class IterateThroughAllHashset {
    public static void main(String[] args) {
        HashSet h = new HashSet();
        h.add(2);
        h.add(7);
        h.add(4);
        Iterator i = h.iterator();
        while (i.hasNext()){
            System.out.println(i.next());
        }
    }
}
