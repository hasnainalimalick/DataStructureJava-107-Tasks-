import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class JoinTwoArrayList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(3);
        l.add(6);
        l.add(5);
        l.add(4);

        ArrayList l2 = new ArrayList();
        l2.add(11);
        l2.add(12);
        l2.add(13);
        l2.add(14);
        l2.add(15);

        ArrayList join = new ArrayList();
        join.addAll(l);
        join.addAll(l2);
        System.out.println(join);
    }
}
