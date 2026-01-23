package Arrays;

import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        System.out.println(Is_ArmStrong(n));

    }

    public static boolean Is_ArmStrong(int n){
        int d = CountDigit(n);
        int sum = 0;
        int p = n;
        while(n>0){
            int rem = n%10;
            sum = (int) (sum+Math.pow(rem , d));
            n=n/10;
        }
        if(sum == p){
                return true;

            }
            else{
                return false;
            }
    }

    public static int CountDigit(int n){
        int count = 0;
        while(n>0){
            count ++;
            n = n/10;
        }
        return count;
    }
    
}
