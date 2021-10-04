import java.util.ArrayList;

public class UpdateSpecificElement {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("blue");
        colors.add("red");
        colors.add("sky");
        colors.set(2, "pink");
        for (int i = 0; i < colors.size(); i ++){
            System.out.println(colors.get(i));
        }
    }
}
