package Arrays;

public class Kth_Root { // solve using binary search

    public static void main(String[] args){

        int n = 87;
        int k = 3;
        System.out.print(kthRoot(n, k));
    }

    public static int kthRoot(int num,int k){

        int low = 1;
        int high = num;
        int ans = 0;
        while(low <= high){
            int mid = ((low + high)/2);

            if(Math.pow(mid , k) <= num){
                ans = mid;
                low = mid+1;
            }
            
            else {
                high = mid-1;
            }
        }
        return ans;
    }
    
}
