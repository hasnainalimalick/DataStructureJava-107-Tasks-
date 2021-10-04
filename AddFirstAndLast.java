import java.util.LinkedList;

public class AddFirstAndLast {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(3);
        l.add(5);
        l.addFirst(99);
        l.addLast(100);
        System.out.println(l);
    }
}
