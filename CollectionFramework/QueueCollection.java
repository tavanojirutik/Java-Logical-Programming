package CollectionFramework;

import java.util.LinkedList;
import java.util.Queue;

public class QueueCollection {
    public static void main(String[] args) {
        Queue<Integer> que = new LinkedList<>();
        que.offer(22);
        que.offer(34);
        que.offer(98);
        que.offer(9);

        System.out.println(que);

        // System.out.println(que.poll());
        // que.poll();
        System.out.println(que);
        System.out.println(que.peek());

    }
}
