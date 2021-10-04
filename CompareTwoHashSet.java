import java.util.HashSet;

public class CompareTwoHashSet {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(3);
        s.add(4);
        s.add(6);

        HashSet s2 = new HashSet();
        s2.add(99);
        s2.add(100);
        s2.add(101);

        for (Object elem : s){
            if (s2.contains(elem)){
                System.out.println("True");
            }
            else System.out.println("f");

        }
    }
}
