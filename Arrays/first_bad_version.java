package Arrays;

public class first_bad_version {

    public static void main(String[] args) {
        
    }

    public static int BadVersion(int n){
        int low = 0;
        int high= n;
        int ans = 0;

        while(low <= high){

            int mid = (low + (high - low)/2);

            if(isBadVersion(mid) == true){
                ans = mid;
                high = mid - 1;
            }
            else{
                low = mid + 1;
            }
        }
        return ans;
    }
    
}
