package Array_List;

import java.util.*;

public class ArrayList_Demo {

    public static void main(String[] args) {
        
        ArrayList<Integer> a1 = new ArrayList<>();
        System.out.println(a1);
        System.out.println(a1.size());
        a1.add(10);
        a1.add(20);
        a1.add(30);
        a1.add(40);
        a1.add(50);
        a1.add(2,-6);  // range 0 to size
        System.out.println(a1);
        System.out.println(a1.size());
        // Collections.sort(a1);
        // System.out.println(a1);

        // get --------

        System.out.println(a1.get(3)); // get range 0 to size-1

        // set-------

        a1.set(3, 90);
        System.out.println(a1);

        // remove---------
        System.out.println(a1.remove(1));
        System.out.println(a1);
    }
    
}
