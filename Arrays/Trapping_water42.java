// package Arrays;

// public class Trapping_water42 {

//     public static void main(String[] args) {
//         int height[] = {4,2,0,3,2,5};
        
//         System.out.println(TrappedWater(height));

//     }

//     public static int TrappedWater(int height[]){
        
//         int sum = 0;
//         for(int i=0; i<height.length; i++){
//             int Right_max = Integer.MIN_VALUE;
//             int Left_Max = Integer.MIN_VALUE;
//             for(int j=i; j<height.length; j++){
//                 if(height[j] > Right_max){
//                     Right_max = height[j];
//                 }
                
//             }
//             for( int k=0; k<=i; k++){
//                 if(height[k] > Left_Max){
//                     Left_Max = height[k];
//                 }
//             }
//             sum = sum + Math.min(Right_max,Left_Max)-height[i];
//         }
//         return sum;
//     }

    
// }

package Arrays;

public class Trapping_water42 {

    public static void main(String[] args) {
        int height[] = {4,2,0,3,2,5};
        
        System.out.println(TrappedWater(height));

    }

    public static int TrappedWater(int height[]){
        
        int sum = 0;
        int n = height.length;
        int left[] = new int[n];

        left[0] = height[0];

        for(int i=1; i<n; i++){
            left[i] = Math.max(left[i-1],height[i]);
        }

        int right[] = new int[n];
        right[n-1] = height[n-1];

        for(int i=n-2; i>=0; i--){
            right[i] = Math.max(right[i+1],height[i]);
        }

        for(int i=0; i<n; i++){
            sum= sum + Math.min(left[i],right[i])-height[i];
        }
        return sum;
    }
}

