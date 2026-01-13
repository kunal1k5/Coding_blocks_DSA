
package Arrays;

public class Missing_Number268 {

    public static void main(String[] args) {

        int nums[] = {9,6,4,2,3,5,7,0,1};

        System.out.print(Missing(nums));
        
    }

    public static int Missing(int nums[]){

        int XOR1 = 0;
        int XOR2 = 0;
        

        for(int i=0; i<nums.length; i++){
            XOR2 = XOR2 ^ nums[i];
            XOR1 = XOR1 ^ (i+1);
        }
        
        return XOR1 ^ XOR2;
    }
    
}
