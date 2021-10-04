import java.util.ArrayList;
import java.util.HashSet;

public class ConvertHashToArray {
    public static void main(String[] args) {
        HashSet s = new HashSet();
        s.add(3);
        s.add(8);
        s.add(5);

        Integer[] array = new Integer[s.size()];
        s.toArray(array);
        System.out.println();
        for (int ok : array){
            System.out.println(ok);
        }
    }
}
