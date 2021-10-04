import java.util.HashSet;
import java.util.TreeSet;

public class COnvertHashSetToTree {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(3);
        s.add(9);
        s.add(6);
        TreeSet ts = new TreeSet(s);
        System.out.println(ts);
    }
}
