import java.util.TreeMap;

public class DeletAllItemsTm {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(12, "hasnain");
        tm.put(13, "hasnain");

        tm.clear();
        System.out.println(tm);
    }
}
