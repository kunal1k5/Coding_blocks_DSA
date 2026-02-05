public class First_occurence_lat {

    public static void main(String[] args) {
        int arr[] = {1,3,5,3,5,7,11,3,11,8};
        int item = 1;
        int i = arr.length-1;
        System.out.println(firstOccrLast(arr,i, item));
    }

    public static int firstOccrLast(int[] arr,int i,int item){
      

        if(i < 0){
            return -1;
        }
        
        if(arr[i] == item){
            return i;
        }
        return firstOccrLast(arr, i-1, item);
    }

}
