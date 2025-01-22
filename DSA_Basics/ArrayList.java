import java.util.*;
import java.util.ArrayList;

public class Array10II {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(5);
        Scanner in=new Scanner(System.in);

        // list.add(67);
        // list.add(66);
        // list.add(68);
        // list.add(69);
        // list.add(60);

        // System.out.println(list);
        // System.out.println(list.contains(66));

        // list.remove(2);
        // list.set(0,24);
        // System.out.println(list);

        //input
        for (int i = 0; i <5; i++) {
            list.add(in.nextInt());
        }

        //output
        for (int i = 0; i < 5; i++) {
            System.out.println(list.get(i));//pass index here list[index wont wok here]

    }
}
