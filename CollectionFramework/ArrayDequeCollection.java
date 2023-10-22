package CollectionFramework;

import java.util.ArrayDeque;

public class ArrayDequeCollection {
    public static void main(String[] args) {
        ArrayDeque<Integer> ad = new ArrayDeque<>();
        ad.offer(12);
        ad.offerFirst(99);
        ad.offerLast(88);
        ad.offer(56);
        ad.offer(35);

        System.out.println(ad);
        System.out.println(ad.peek());
        System.out.println(ad.peekFirst());
        System.out.println(ad.peekLast());

        System.out.println("Poll : "+ ad.poll());
        System.out.println(ad.pollLast());
    }
}
