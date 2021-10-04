import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CompareTwoNumber {
    public static void main(String[] args) {
        ArrayList colorsNum = new ArrayList();
        colorsNum.add(8);
        colorsNum.add(5);
        colorsNum.add(4);
        colorsNum.add(4);
        colorsNum.add(4);
        ArrayList colorsNum2 = new ArrayList();
        colorsNum2.add(8);
        colorsNum2.add(5);
        colorsNum2.add(5);
        colorsNum2.add(5);
        colorsNum2.add(4);
        for (int i = 0; i < colorsNum.size(); i++) {
            if (colorsNum.get(i) == colorsNum2.get(i)) {
                System.out.println("True");
            } else System.out.println("false");

        }
    }
}

