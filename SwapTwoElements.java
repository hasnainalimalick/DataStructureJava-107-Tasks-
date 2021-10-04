import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class SwapTwoElements {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add(8);
        colors.add(5);
        colors.add(4);
        Collections.swap(colors, 0 , 1);
        System.out.println(colors);

    }
}
