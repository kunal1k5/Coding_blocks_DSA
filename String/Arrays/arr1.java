package Arrays;

import java.util.Scanner;

public class arr1 {

    public static void main(String[] k){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Display(arr);
    }

    public static void Display(int[] arr) {
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]);
        }
    }
    
}
