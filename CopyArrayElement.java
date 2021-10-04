import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CopyArrayElement {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        ArrayList colorName = new ArrayList();
        colorName.add("red");
        colors.add(8);
        colors.add(5);
        Collections.copy(colors, colorName);
        System.out.println(colors);
        System.out.println(colorName);

    }
}
