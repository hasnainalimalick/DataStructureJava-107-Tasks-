import java.util.*;

public class ReverseTree {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(4);

        Iterator it = s.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
