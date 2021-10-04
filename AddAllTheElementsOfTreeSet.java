import java.util.TreeSet;

public class AddAllTheElementsOfTreeSet {
    public static void main(String[] args) {
        TreeSet s1 = new TreeSet();
        s1.add(3);
        s1.add(8);
        s1.add(4);

        TreeSet s2 = new TreeSet();

        s2.addAll(s1);
        System.out.println(s2);

    }
}
