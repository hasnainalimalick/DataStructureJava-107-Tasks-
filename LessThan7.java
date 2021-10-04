import java.util.TreeSet;

public class LessThan7 {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(4);
        TreeSet val = (TreeSet) s.headSet(7);
        System.out.println(val);
    }
}
