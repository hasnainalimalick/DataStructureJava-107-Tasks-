import java.util.LinkedList;

public class RemoveFirstAndLast {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(3);
        l.add(5);
        l.removeLast();
        l.removeFirst();
        System.out.println(l);
    }
}
