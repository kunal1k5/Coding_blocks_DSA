package Array2D;

public class basic2d {

    public static void main(String[] args) {
         int [][] arr = new int[3][4];
         System.out.println(arr);
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[1][2]);
         int[][] other = arr;
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
