package Array_List;

import java.util.ArrayList;

public class ArrayList_Traversal{

    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>();

        a.add(10);
        a.add(20); 
        a.add(30);
        a.add(40);
        a.add(50);
        a.add(2, -6);

        System.out.println(a);

        for(int i=0; i<a.size(); i++){
            System.out.print(a.get(i)+" ");
        }
        System.out.println();

        for(int v : a){   // for each loop iska work hai value read karna 
            System.out.print(v + " "); // for each loop kabhi bhi reverse nhi chalta 
        }                               // ye jab tak chalega tab tak value hoga 

        System.out.println();

        char arr[] ={'a','b','c'};
        for(char t : arr){
            System.out.print(t + " ");
        }
    }
}
