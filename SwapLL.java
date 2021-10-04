import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class SwapLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(4);
        Collections.swap(l,0, 1);
        System.out.println(l);
    }
}
