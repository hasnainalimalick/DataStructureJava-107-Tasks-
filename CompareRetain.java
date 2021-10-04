import java.util.HashSet;

public class CompareRetain {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(3);
        s.add(4);
        s.add(6);
        s.add(4);

        HashSet s2 = new HashSet();
        s2.add(99);
        s2.add(100);
        s2.add(101);
        s2.add(4);

        s2.retainAll(s);
        System.out.println(s2);


    }
}
