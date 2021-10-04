import java.util.TreeMap;

public class CopyTmToTm {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(12, "hasnain");
        TreeMap tc = new TreeMap();
        tc.put(13, "sagheer");
        tm.putAll(tc);
        System.out.println(tm);
    }
}
