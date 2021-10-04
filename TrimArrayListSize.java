import java.util.ArrayList;

public class TrimArrayListSize {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("ok");
        colors.add("ok");
        colors.add("ok");
        System.out.println(colors);
        System.out.println("After trimming");
        colors.trimToSize();
        System.out.println("ok"+colors);
    }
}
