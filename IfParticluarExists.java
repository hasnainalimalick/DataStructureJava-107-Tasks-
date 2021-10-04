import java.util.LinkedList;

public class IfParticluarExists {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(3);
        l.add(4);
        if (l.contains(3)){
            System.out.println("t");
        }
    }
}
