package Array_List;

import java.util.ArrayList;

public class ArrayList_Working {

    public static void main(String[] args) {

        int arr1[] = {9,8};
        int arr2[] = {8,7};
        AddNumber(arr1, arr2);
        
    }

    public static void AddNumber(int[] arr1,int[] arr2){

        ArrayList<Integer> a = new ArrayList<>();
        int i = arr1.length-1;
        int j = arr2.length-1;
        int carry = 0;

        while(i>=0 && j>=0){
            int sum = arr1[i] + arr2[j] + carry;
            a.add(sum%10);
            carry = sum /10;
            i--;
            j--;
        }
        while(i>=0){
            int sum = arr1[i] + carry;
            a.add(sum%10);
            carry = sum /10;
            i--;
        }
        while(j>=0){
            int sum = arr2[j] + carry;
            a.add(sum%10);
            carry = sum /10;
            j--;
        }

        if(carry > 0){
            a.add(carry);
        }
        for(int k = a.size()-1; k>=0; k--){
            System.out.print(a.get(k) + " ");
        }
    }
    
}
