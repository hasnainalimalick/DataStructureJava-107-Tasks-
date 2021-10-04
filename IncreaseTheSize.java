import java.util.ArrayList;

public class IncreaseTheSize {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("red");
        colors.add("red");
        colors.add("red");
        colors.add("red");
        colors.ensureCapacity(8);
        colors.add("blue");
        System.out.println(colors);
    }
}
