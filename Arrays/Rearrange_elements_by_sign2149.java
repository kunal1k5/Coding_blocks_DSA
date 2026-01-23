package Arrays;

public class Rearrange_elements_by_sign2149{
    public static void main(String[] args){

        int arr[] = {3,1,-2,-5,2,-4};

        int[] k = Rearrange(arr);

        for(int i=0; i<k.length; i++){
            System.out.print(k[i] + " ");
        }

    }

    public static int[] Rearrange(int arr[]){

        int n = arr.length;
        int ans[] = new int[n];
        int posIndex = 0;
        int negIndex = 1;

        for(int i=0; i<arr.length; i++){
            if(arr[i] < 0){
                ans[negIndex] = arr[i];
                negIndex += 2;
            }
            else{
                ans[posIndex] = arr[i];
                posIndex += 2;
            }
        }
        return ans;
    }
}