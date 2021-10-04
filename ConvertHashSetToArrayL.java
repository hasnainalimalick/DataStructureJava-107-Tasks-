import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertHashSetToArrayL {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(4);
        s.add(7);
        s.add(6);

        List l = new ArrayList(s);
        System.out.println(l);
    }
}
