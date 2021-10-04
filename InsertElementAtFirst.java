import java.util.ArrayList;

public class InsertElementAtFirst {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("blue");
        colors.add("red");
        colors.add("sky");
        colors.add(0 , "green");
        for (int i = 0; i < colors.size(); i ++){
            System.out.println(colors.get(i));
        }
    }
}
