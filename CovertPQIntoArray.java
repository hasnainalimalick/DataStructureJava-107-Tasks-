import java.util.ArrayList;
import java.util.PriorityQueue;

public class CovertPQIntoArray {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);
        ArrayList l = new ArrayList(pq);
        System.out.println(l);
    }
}
