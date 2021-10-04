import java.util.TreeMap;

public class IfKeyExixts {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(12, "hasnain");
        tm.put(13, "hasnain");

            if (tm.containsKey(12)){
                System.out.println("t");
            }
            else System.out.println("F");

    }
}
