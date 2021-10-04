import java.util.ArrayList;

public class PrintPosition {
    public static void main(String[] args) {
        ArrayList li = new ArrayList();
        li.add(2);
        li.add(9);
        li.add(8);
        li.add(5);
        for (int i = 0; i < li.size(); i ++){
            System.out.println(li.get(i));
        }
    }
}
