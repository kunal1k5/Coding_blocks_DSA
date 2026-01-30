public class Find_pow {
    public static void main(String[] args) {
        int x = 4;
        int n = 5;
        System.out.println(FindPow(x, n));
    }

    public static int FindPow(int x, int n){
        if(n==0){
            return 1;
        } 

        int ans = FindPow(x,n-1);
        return ans*x;
    }
}
