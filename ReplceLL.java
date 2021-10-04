import java.util.LinkedList;

public class ReplceLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(3);
        l.add(4);
        l.set(1, 100);
        System.out.println(l);
    }
}
