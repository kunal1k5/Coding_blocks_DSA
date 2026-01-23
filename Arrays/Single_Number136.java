package Arrays;

public class Single_Number136 {

    public static void main(String[] args) {
        int nums[] = {4,1,2,1,2};
        System.out.print(singleNumber(nums));
    }

    public static int singleNumber(int[] nums) {
        
        int XOR = 0;
        for(int i=0; i<nums.length; i++){
            XOR = XOR ^ nums[i];
        }
        return XOR;
    }
    
    
}
