import java.util.LinkedList;

public class RemoveAllLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(3);
        l.add(3);
        l.add(3);
        l.removeAll(l);
        System.out.println(l);
    }
}
