package Arrays;

import java.util.Scanner;

public class Max_Array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(MaxArray(arr));
    }

    public static int MaxArray(int arr[]){
        int Max_Value = Integer.MIN_VALUE;
        for(int i=0; i<arr.length; i++){
            if(arr[i] > Max_Value){
                Max_Value = arr[i];
            }
        }
        return Max_Value; 
    }
    
}
