import java.util.HashMap;
import java.util.Set;

public class SetView {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(04, "younis");
        Set s = hm.entrySet();
        System.out.println(s);
    }
}
