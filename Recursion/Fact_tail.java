public class Fact_tail {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Fact(n, 1));

    }

    public static int Fact(int num,int ans){

        if(num == 0){
            return ans;
        }
        return Fact(num-1, ans*num);
    }
}
