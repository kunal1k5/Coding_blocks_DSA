package Arrays;

import java.util.*;
public class Two_sum1 {

    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        int[] result = TwoSum(arr, target);
        System.out.println(Arrays.toString(result));
        
    }

    public static int[] TwoSum(int[] arr, int target){
     
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1;j<arr.length; j++){
                if(target - arr[j] == arr[i]){
                    return new int[] {i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
    
}
