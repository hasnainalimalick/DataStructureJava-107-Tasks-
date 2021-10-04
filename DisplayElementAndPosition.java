import java.util.LinkedList;

public class DisplayElementAndPosition {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(5);
        l.add(9);
        l.add(8);

        for (int i = 0; i < l.size(); i ++){
            System.out.println("index"+i+"elements"+ l.get(i));
        }

    }
}
