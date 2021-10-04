import java.util.Collections;
import java.util.LinkedList;

public class ShuffleLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(24);
        l.add(3);
        Collections.shuffle(l);
        System.out.println(l);
    }
}
