package Arrays;

import java.util.*;

public class Leet_Code2784 {

    public static void main(String[] args) {

        int arr[]
        
    }

    public static boolean IsArrayGood(int[] nums){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = nums[0];
        for(int i=0; i<nums.length; i++){
            // if(max < nums[i]){
            //     max = nums[i];
            // }
            if(n < nums.length && nums[i] == nums[i+1]){
                return true;
            }
        }
        return false;
    }
    
}
