package Arrays;

public class Max_Consecutive_1s {

    public static void main(String[] args) {
        int nums[] = {1,1,0,1,1,1};
        System.out.print(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums){

        int count = 0;
        int max = 0;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;

            }

            max = Math.max(max,count);

            if(nums[i] == 0){
                count = 0;
            }
            
        }
        return max;
    }
    
}
