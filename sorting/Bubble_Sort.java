package sorting;

public class Bubble_Sort {
    public static void main(String[] args) {
        int arr[] ={3,5,1,5,7,9,0,23,8};
        BubbleSort(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
         
    }

    public static void BubbleSort(int arr[]){

        int n = arr.length;
        for(int turn=1; turn<n; turn++){
            for(int i=0; i<n-turn; i++){
            if(arr[i] > arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        }
    }
}
