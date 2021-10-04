import java.util.ArrayList;

public class EmptyArrayList {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.add("Red");
        colors.clear();
        System.out.println(colors);
    }
}
