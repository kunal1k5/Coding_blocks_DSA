public class Two_sum1 {

    public static void main(String[] args) {
        
        int nums[] ={1,2,3,4,5,6,7};
        int target = 9;
        System.out.print(TwoSum(nums, target));
    }
    
    public static int TwoSum(int[] nums, int target){
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if( nums[i] + nums[j] == target){
                    return new int[] {i,j};
                }
            }
        }
        return new int[] {};
    }
}
