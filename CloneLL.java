import java.util.LinkedList;

public class CloneLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(3);
        l.add(5);
        LinkedList clone = (LinkedList) new LinkedList(l).clone();
        System.out.println(clone);
    }
}
