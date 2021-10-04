import java.util.PriorityQueue;

public class RetriveFirstPQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);
        System.out.println(pq.peek());
    }
}
