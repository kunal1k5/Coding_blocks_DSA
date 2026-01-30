package Arrays;

public class Leet_code1752 {

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2};
        System.out.println(IsArraySortedAndRotated(arr));
       
    }
    public static boolean IsArraySortedAndRotated(int[] nums){

        int count =0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > nums[(i+1)%nums.length]){
                count++;
                if(count > 1){
                    return false;
                }
            }
            
        }
        return true;
    }

}
