package Array2D;

public class Spiral_Print {

    public static void main(String[] args) {

        int arr[][] = {{1, 2, 3, 4}, 
                        {5, 6, 7, 8}, 
                        {9, 10, 11, 12},}; 
                        // {13, 14, 15, 16}, 
                        // {17, 18, 19, 20}};

        spiral(arr);
        
    }

    public static void spiral(int[][] arr){
        int minR = 0;
        int maxR = arr.length-1;
        int minC = 0;
        int maxC = arr[0].length-1;
        int count = 0;

        while(count < arr.length*arr[0].length){

        for(int i=minC; i<=maxC && count < arr.length*arr[0].length; i++){
            System.out.print(arr[minR][i]+" ");
            count++;
        }
        minR++;

        for(int i=minR; i<=maxR && count < arr.length*arr[0].length; i++){
            System.out.print(arr[i][maxC]+" ");
            count++;
        }
        maxC--; 

        for(int i=maxC; i>=minC && count < arr.length*arr[0].length; i--){
            System.out.print(arr[maxR][i]+" ");
            count++;
        }
        maxR--;

        for(int i=maxR; i>=minR && count < arr.length*arr[0].length; i--){
            System.out.print(arr[i][minC]+" ");
            count++;
        }
        minC++;
    }
    }
    
}
