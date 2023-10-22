package CollectionFramework;

import java.util.Stack;

public class StackCollection {
    public static void main(String[] args) {
        Stack<String> str =new Stack<>();
        str.push("Floor 1");
        str.push("Floor 2");
        str.push("Floor 3");
        str.push("Floor 4");
        str.push("Floor 5");

        System.out.println(str);
        System.out.println(str.peek());
        str.pop();
        System.out.println(str);
    }
}
