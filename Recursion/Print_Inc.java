public class Print_Inc {
    public static void main(String[] args) {
        int n =5;
        PrintInc(n);
    }
    public static void PrintInc(int n){
        if(n==0){
            return;
        }
        PrintInc(n-1);
        System.out.println(n);
    }
}
