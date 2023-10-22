package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnArraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();
        list.add(12);
        list.add(19);
        list.add(11);
        list.add(16);

        for(Integer ele : list){
            System.out.println(ele);
        }

        for(int i=0;i<list.size();i++){
            System.out.println("Element is Present is : "+list.get(i));
        }

        list.add(0, 100);
        System.out.println(list);

        list.remove(Integer.valueOf(11));

        list.remove(0);
        System.out.println(list);

        ArrayList<Integer> list2 = new ArrayList<>();

        list2.add(24);
        list2.add(43);
        list2.add(31);

        System.out.println(list2);
        list.addAll(list2);
        System.err.println(list);

        System.out.println(list2.get(2));
        list2.set(0, 289);
        System.out.println(list2);

        System.out.println(list2.contains(100));


        List<Integer> list3 = new ArrayList<>();
        list3.add(23);
        list3.add(89);
        list3.add(90);
        System.out.println(list3);

    }


}
