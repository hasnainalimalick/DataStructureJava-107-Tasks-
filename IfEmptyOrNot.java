import java.util.ArrayList;

public class IfEmptyOrNot {
    public static void main(String[] args) {
        ArrayList colors = new ArrayList();
        colors.add("ok");
        colors.add("ok");
        colors.add("ok");
        if (colors.isEmpty()){
            System.out.println("true");
        }
        else System.out.println("False");
    }
}
