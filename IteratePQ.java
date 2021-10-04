import java.util.PriorityQueue;

public class IteratePQ {
    public static void main(String[] args) {
        PriorityQueue pq = new PriorityQueue();
        pq.add(3);
        pq.add(3);
        pq.add(3);
        pq.add(3);
        for (Object e : pq){
            System.out.println(e);
        }


    }
}
