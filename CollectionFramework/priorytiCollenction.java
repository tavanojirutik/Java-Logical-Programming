package CollectionFramework;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class priorytiCollenction {
    public static void main(String[] args) {
        Queue<Integer> qu = new PriorityQueue<>(Comparator.reverseOrder());
        qu.offer(22);
        qu.offer(10);
        qu.offer(1);
        qu.offer(21);
        qu.offer(99);
        qu.offer(5);
        System.out.println(qu);
        qu.poll();
        System.out.println(qu);
        System.out.println(qu.poll());


    }
}
