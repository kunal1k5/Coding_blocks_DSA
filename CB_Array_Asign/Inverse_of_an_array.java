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
        int i = sc.nextInt();
        int j = sc.nextInt();
        inverse(arr, i, j);
        
        for(int k =0; k<arr.length; k++){
            System.out.print(arr[k] + " ");
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
