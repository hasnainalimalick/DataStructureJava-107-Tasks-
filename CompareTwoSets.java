import java.util.TreeSet;

public class CompareTwoSets {
    public static void main(String[] args) {
        TreeSet s = new TreeSet();
        s.add(3);
        s.add(8);
        s.add(5);
        s.add(4);

        TreeSet s1 = new TreeSet();
        s1.add(2);
        s1.add(8);
        s1.add(5);
        s1.add(4);

        for (Object element : s){
            if (s1.contains(element)){
                System.out.println("true");
            }
            else System.out.println("false");

        }
    }
}
