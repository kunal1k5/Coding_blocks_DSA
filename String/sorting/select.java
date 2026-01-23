package sorting;

public class select {

    public static void main(String[] args) {

        int arr [] = {2,0,3,19,5,10,30,6,9,1};
        select(arr);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        
    }

    public static void select(int arr[]){

        for(int i=0; i<arr.length; i++){
            int main = i;
            for(int j=i+1; j<arr.length; j++){

                if(arr[j] < arr[main]){
                    main = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[main];
            arr[main] = temp;

        }
    }
    
}
