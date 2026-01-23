package Arrays;

public class linear_search {

    public static void main(String[] args) {
        int[] arr = {2,3,5,4,6,7,0};
        int item = 1;

        
        System.out.println(LinearSearch(arr, item));

    }
    
    public static int LinearSearch(int arr[],int item){

        for(int i=0; i<arr.length; i++){
            if(arr[i] == item){
                return i;
            }
        }
         return -1;
    }
}
