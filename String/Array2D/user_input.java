package Array2D;

import java.util.Scanner;

public class user_input {

    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int column = sc.nextInt();

        int [][] arr = new int[row][column];

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = sc.nextInt();
            }
      
        }
        Display(arr);
    }
    public static void Display(int[][] arr) {
        // int row = arr.length; // rows length
        // int col = arr[0].length; // column length

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    
}
