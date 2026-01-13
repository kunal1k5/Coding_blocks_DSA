package Arrays;

public class binary_search {

    public static void main(String[] args) {

        int arr[] = {1,2,3,4,5,6,7,8,11,12,13,14,15};
        int k = 16;
        int ans = binarySearch(arr, k);
        System.out.print(ans);
        
    }

    public static int binarySearch(int arr[], int k){
        int low =0;
        int high = arr.length-1;

        while(low <= high){
            int mid = (low+high)/2;
            if(arr[mid] == k){
                return mid;
            }
            else if (arr[mid] < k){
                low = mid +1;
            }
            
            else{
                high = mid -1;
            }
        }
        return -1;
    }
    
}
