import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ConvertLLToLL {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        l.add(2);
        l.add(3);
        l.add(4);


        List l1 = new ArrayList(l);
        System.out.println(l1);


    }
}
