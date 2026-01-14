package Array2D;

import java.util.Scanner;

public class Search_2D_Matrix_240 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int[][] arr = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int target = sc.nextInt();

        searchMatrix(arr, target);
        
    }

    public static boolean searchMatrix(int[][] matrix, int target){
        int n = matrix.length;
        int row =0;
        int col =matrix[0].length;

        while(row < n && col>=0){
            if(matrix[row][col] == target){
                return true;
            }
            else if(matrix[row][col] < target){
                row++;
            }
            else{
                col--;
            }
        }
        return false;
 
    }
    
}
