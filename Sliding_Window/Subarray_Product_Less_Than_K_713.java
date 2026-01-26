package Sliding_Window;

public class Subarray_Product_Less_Than_K_713 {
    
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,2};
        int k = 10;
        int n = Subarray_Product_Less_Than_K(arr, k);
        System.out.print(n);
    }

    public static int Subarray_Product_Less_Than_K(int[] arr,int k){

        int si =0; // starting point
        int ei =0; // ending point
        int p = 1; // product
        int ans =0;
        while(ei < arr.length){

            // Growing -------------
            p *= arr[ei];

            // shrinking --------

            while(p >= k && si <= ei){
                p /= arr[si];
                si++;
            }

            // Answer calculate-------

            ans += (ei-si+1);
            ei++;
        }
        return ans;
    }

}
