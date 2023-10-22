package CollectionFramework;

import java.util.HashSet;
import java.util.Set;

public class HashSetCollection {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(22);
        set.add(33);
        set.add(56);
        set.add(39);
        set.add(39);


        System.out.println(set);
        set.remove(56);
        System.out.println(set);
        System.out.println(set.isEmpty());
        System.out.println(set.contains(33));

    }
}
