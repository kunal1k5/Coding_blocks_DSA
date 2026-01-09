// package Arrays;

// public class Second_largest {

//     public static void main(String [] args){

//         int arr[] = {5,1,0,7,7,2};

//         System.out.print(SecondLargest(arr));

//     }

//     public static int SecondLargest(int arr[]){
        
//         int n = arr.length;
//         int largest = arr[0];

//         for(int i=0; i<n; i++){
//             if(arr[i]> largest){
//                 largest = arr[i];
//             }
            
//         }
//         int Sec_Larg = arr[0];
//         for( int i=0; i<n; i++){
//             if(arr[i] > Sec_Larg && arr[i] < largest){
//                 Sec_Larg = arr[i];
//             }

//         }
//         return Sec_Larg;
//     }
    
// }



// Optimal Approach ------------


package Arrays;

public class Second_largest {

    public static void main(String [] args){

        int arr[] = {5,1,0,7,7,2};

        System.out.print(SecondLargest(arr));

    }

    public static int SecondLargest(int arr[]){
        
        int n = arr.length;
        int largest = arr[0];
        int SecLarg = -1;

        for(int i=0; i<n; i++){
            if(arr[i]> largest){
                SecLarg = largest;
                largest = arr[i];
            }
            else if ( arr[i] < largest && SecLarg < arr[i]){
                SecLarg = arr[i];
            }
            
        }
        return SecLarg;
    }
}
