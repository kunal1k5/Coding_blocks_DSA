package CB_Array_Asign;

import java.util.Scanner;

public class Inverse_of_an_array {
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i =0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        // int[] arr = {0,2,1,4,3};

        inverse(arr, 1, arr.length-1);
        
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }
    public static void inverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            i++;
            j--;
        }
    }
}
