import java.util.TreeMap;

public class AllTheKeysTM {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(12, "hasnain");
        tm.put(13, "hasnain");
        System.out.println(tm.keySet());
    }
}
