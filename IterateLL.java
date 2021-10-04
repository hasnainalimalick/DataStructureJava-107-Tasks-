import java.util.LinkedList;

public class IterateLL {
    public static <Sting> void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(3);
        l.add(7);
        l.add(6);
        l.add(4);
        for (Object element : l){
            System.out.println(element);
        }
    }
}
