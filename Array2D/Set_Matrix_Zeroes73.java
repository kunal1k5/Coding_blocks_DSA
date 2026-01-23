package Array2D;

public class Set_Matrix_Zeroes73 {

    public static void main(String[] args) {
        
    }

    public static int[][] ZeroMatrix(int[][] matirx){

        int n = matirx.length;
        int m = matirx[0].length;   

        int[] col = new int[m];
        int[] row = new int[n];

        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){

                if(matirx[i][j] == 0){
                    row[i] = 1;
                    col[j] = 1;
                }
            }
        }
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                if(row[i] == 1 || col[j] == 1){
                    matirx[i][j] = 0;
                }
            }
        }

        return matirx;
    }
    
}
