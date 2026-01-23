package Binary_Search_Adv;

import java.util.*;

public class Aggrow_Aggressive_Cows {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();// for multiple test case
        while(t>0){
        int nos = sc.nextInt(); // no of stall
        int noc = sc.nextInt(); // no of cow
        int []stall = new int[nos];
        for(int i=0; i<stall.length; i++){
            stall[i] = sc.nextInt();
        }
        Arrays.sort(stall);
        System.out.print(MinDistance(stall, noc));
    }
}

    public static int MinDistance(int[] stall, int noc){
        int low = stall[0];
        int high = stall[stall.length-1];
        int ans = 0;

        while(low <= high){
            int mid = (low+high)/2;
            if(isitPossible(stall,noc,mid) == true){
                ans = mid;
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }
        return ans;
    }

    public static boolean isitPossible(int[] stall, int noc, int mid) {
        
        int position = stall[0];
        int cowsCount = 1;

        for(int i=1; i<stall.length; i++){
            if(stall[i] - position >= mid){
                cowsCount++;
                position=stall[i];
            }
            if(cowsCount == noc){
                return true;
            }
        }
        return false;
    }
}
