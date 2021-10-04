import java.util.ArrayList;
import java.util.Collection;

public class SearchAnElement {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("blue");
        colors.add("red");
        colors.add("sky");

            if (colors.contains("red")){
                System.out.println("true");
            }
            else System.out.println("false");

    }
}
