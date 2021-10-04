import java.util.HashMap;

public class CloneHm {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(04, "younis");



        HashMap h = (HashMap) new HashMap(hm).clone();
        System.out.println(h);

    }
}
