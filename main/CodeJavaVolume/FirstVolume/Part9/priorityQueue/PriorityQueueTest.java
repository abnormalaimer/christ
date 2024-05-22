package CodeJavaVolume.FirstVolume.Part9.priorityQueue;

import java.time.LocalDate;
import java.util.PriorityQueue;

public class PriorityQueueTest {
    public static void main(String[] args) {
        PriorityQueue<LocalDate> pq = new PriorityQueue<>();
        pq.add(LocalDate.of(2019, 3, 18));
        pq.add(LocalDate.of(2019, 5, 4));
        pq.add(LocalDate.of(2019, 2, 28));
        pq.add(LocalDate.of(2020, 1, 15));

        System.out.println("iterating over elements");
        for (LocalDate date : pq)
            System.out.println(date);
        System.out.println("removing elements");
        while (!pq.isEmpty())
            System.out.println(pq.remove());

    }
}
