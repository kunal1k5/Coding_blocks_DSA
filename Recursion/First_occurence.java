public class First_occurence {
    public static void main(String[] args) {
        int arr[] = {3,2,5,7,5,6,5,15,5};
        int k = 1;
        
        System.out.println(FistOccur(arr, 0, k));
    }

    public static int FistOccur(int[] arr, int i,int k){

        //brute force approach--------------
        // for(int i=0; i< arr.length; i++){
        //     if(arr[i] == k){
        //         return i;
        //     }
        // }
        // return -1;

        //recursion----------------------
        if(i == arr.length){
            return -1;
        }

        if(arr[i] == k){
            return i;
        }
        
        return FistOccur(arr,i+1,k);
        
    }
}
