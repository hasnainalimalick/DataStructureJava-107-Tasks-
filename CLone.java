import java.util.ArrayList;

public class CLone {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("blue");
        colors.add("red");
        colors.add("sky");

        ArrayList newc1 = (ArrayList<String>) colors.clone();
        System.out.println(newc1);
    }
}
