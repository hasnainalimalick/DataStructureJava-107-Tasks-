import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ShuffleElements {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add(8);
        colors.add(5);
        colors.add(4);
        colors.add(4);
        colors.add(4);
        colors.add(4);
        Collections.shuffle(colors);
        System.out.println(colors);
    }
}
