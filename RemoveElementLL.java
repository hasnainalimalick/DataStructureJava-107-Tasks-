import java.util.LinkedList;

public class RemoveElementLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(3);
        l.add(4);
        l.remove(2);
        System.out.println(l);
    }
}
