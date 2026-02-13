package Arrays;

public class Move_Zeroes283 {

    public static void main(String[] args) {
        
        int arr [] = {0,1,0,3,12};

        MoveZeros(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
        
    }

    public static void MoveZeros(int arr[]){

        // int j = -1;
        // for(int i=0; j<arr.length; i++){
        //     if(arr[i] ==0 ){
        //         j=i;
        //         break;
        //     }
        // }

        // int j =0;

        // for(int i=j+1; i<arr.length; i++){
        //     if(arr[i] != 0 ){
        //         if(i != j){
        //         int temp = arr[j];
        //         arr[j] = arr[i];
        //         arr[i] = temp;
        //         j++;
        //         }
        //     }
        // }
        int j =0;
        int[] temp = new int[arr.length];
        for(int i=0; i<arr.length; i++){
            if(arr[i] !=0){
                temp[j] = arr[i];
                j++;
            }
        }
    }
    
}
