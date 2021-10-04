import java.util.PriorityQueue;

public class INsertPQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);

        PriorityQueue pq1 = new PriorityQueue();
        pq1.addAll(pq);
        System.out.println(pq1);
    }
}
