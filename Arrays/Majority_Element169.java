package Arrays;

public class Majority_Element169 {

    public static void main(String[] args) {
        int nums[] = {2,2,1,1,1,2,2};

        System.out.print(majorityElement(nums));
        
    }
    public static int majorityElement(int[] nums) {
        int count = 0;
        int ele = 0;
        for(int i=0; i<nums.length; i++){
            if(count == 0){
                count = 1;
                ele = nums[i];
            }
            else if( nums[i] == ele){
                count++;
            }
            else{
                count--;
            }
        }

        int count1 = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == ele) count1++;
        }
        if(count1 > nums.length/2){
            return ele;
        }
        return -1;
    }
    
}
