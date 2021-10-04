import java.util.HashMap;
import java.util.Map;

public class AddValueHashMap {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(04, "younis");
        for (Object mp : hm.entrySet()){
            System.out.println(mp);

        }
    }
}
