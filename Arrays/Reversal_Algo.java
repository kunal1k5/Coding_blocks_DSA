import java.util.Scanner;

public class Reversal_Algo {
    
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        Rotate(arr, k);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void Rotate(int arr[], int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, n-k-1);  // 0 to n-k element
        reverse(arr, n-k, n-1);     // last ke k element 
        reverse(arr, 0, n-1);     // whole reverse
    }

    public static void reverse(int arr[], int i, int j){
        while(i<j){
            int temp = arr[j];
            arr[j] = arr[i];
            arr[i] = temp;
            j--;
            i++;
        }
    }
}
