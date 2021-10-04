import java.util.PriorityQueue;

public class CompareTwoPQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.offer(2);
        pq.offer(2);
        pq.offer(2);

        PriorityQueue pq1 = new PriorityQueue();
        pq1.add(6);
        pq1.add(6);
        pq1.add(6);

        for (Object e : pq){
            if (pq1.contains(e)){
                System.out.println("t");
            }
            else System.out.println("f");
        }
    }
}
