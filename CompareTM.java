import org.w3c.dom.ls.LSOutput;

import java.util.Comparator;
import java.util.TreeMap;

public class CompareTM {
    public static void main(String[] args) {
        TreeMap tm = new TreeMap();
        tm.put(12, "hasnain");
        tm.put(13, "hasnain");
        tm.put(4, "hasnain");
        System.out.println(tm);


    }
    class sort_key implements Comparator<String> {
        @Override
        public int compare(String str1, String str2) {
            return str1.compareTo(str2);
        }
    }
}
