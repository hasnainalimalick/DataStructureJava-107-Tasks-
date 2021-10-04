import java.util.HashMap;

public class IfMapping {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(04, "younis");
        if (hm.containsKey(12)){
            System.out.println("y");
        }
        else System.out.println("n");
    }
}
