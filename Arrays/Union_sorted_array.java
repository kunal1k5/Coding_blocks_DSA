package Arrays;

public class Union_sorted_array {

    public static void main(String[] args) {
        int arr1[] = {1, 1, 2, 3, 4, 5};
        int arr2[] = {2, 3, 4, 4, 5, 6};

        int n = Union(arr1, arr2);
        for (int i = 0; i < n; i++) {
            System.out.println(arr1[i]+" ");
        }
        
    }

    public static int Union(int arr1[],int arr2[]){

        int n = arr1.length;
        int m = arr2.length;

        int i = 0;
        int j = 0;

        int union = 0;
        
        while(i<n && j<m){

            if(arr1[i] <= arr2[j]){
                union = arr1[i];
            }
        }
        return union;
    }
}
