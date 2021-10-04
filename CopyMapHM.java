import java.util.HashMap;

public class CopyMapHM {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(4, "younis");

        HashMap h2 = new HashMap();
        h2.put(3, "ok");
        h2.put(4, "o");
        h2.put(5, "ol");
        hm.putAll(h2);
        System.out.println(hm);

    }
}
