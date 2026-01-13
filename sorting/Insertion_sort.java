package sorting;

public class Insertion_sort {

    public static void main(String[] args) {
        int arr[] = {2,4,1,7,5,-6,10,0,-10};
        insertionSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public static void insertionSort(int arr[]){
        for(int i=1; i<arr.length; i++){
            int picked = arr[i];
            int j = i-1;

            while(j>=0 && arr[j]>picked){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = picked;
            
        }
    }
    
}
