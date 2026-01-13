package sorting;

public class b1 {

    public static void main(String [] args){
         int arr[] ={3,5,1,5,7,9,0,23,8};
        bubble(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void bubble(int arr[]){
        int n = arr.length;

        for(int i=1; i<n; i++){
            for(int j=0; j<n-i; j++){
                if(arr[i] > arr[i+1]){
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                }
            }
        }
    }
    
}
