import java.util.LinkedList;

public class Practice {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(4);
        l.add(4);
        l.add(4);
        LinkedList clone = new LinkedList();
        clone = l;
        System.out.println(clone);
    }
}
