import java.util.HashMap;

public class CheckIfEmptHM {
    public static void main(String[] args) {
        HashMap hm = new HashMap();
        hm.put(12, "sagheer");
        hm.put(04, "younis");
        if (hm.isEmpty()){
            System.out.println("t");
        }
        else System.out.println("f");
    }
}
