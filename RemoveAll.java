import java.util.PriorityQueue;

public class RemoveAll {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);
        pq.clear();
        System.out.println(pq);
    }
}
