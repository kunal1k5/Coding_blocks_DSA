package Sliding_Window;

public class SubArraySum_of_Size_k {

    public static void main(String[] args) {
        
        int[] arr = {2,1,3,4,5,6,7,8,9,2,3};
        int k = 3;
        System.out.println(MaxSum_of_size_k(arr, k));
    }

    //  public static int MaxSum_of_size_k(int[] arr, int k){

    //     int sum =0;
    //     int ans = 0;
    //     for(int i=0; i<k; i++){
    //         sum += arr[i];

    //     }
    //     ans = sum;
    //     for(int i=k; i<arr.length; i++){
    //         sum += arr[i];
    //         sum -= arr[i-k];
    //         ans = Math.max(ans,sum);
    //     }
    //     return ans;
    //  }

    public static int MaxSum_of_size_k(int[] arr,int k){
    
        int ans = 0;
        int sum = 0;

        for(int i=0; i<k; i++){
            sum += arr[i];
        }
        ans = sum;
        for(int i=k; i<arr.length; i++){
            sum += arr[i];
            sum = sum - arr[i-k];
            ans = Math.max(ans,sum);
        }
        return ans;
    }
}
