public class Board_path {
    public static void main(String[] args) {
        int n = 6;
        BoardPath(n, 0, "");
    }

    public static void BoardPath(int n, int current, String ans){

        if(current == n){
            System.out.print(ans+ " ");
            return;
        }

        if(current > n){
            return;
        }
        // BoardPath(n, current+1, ans+1);
        // BoardPath(n, current+2, ans+2);
        // BoardPath(n, current+3, ans+3);
        for(int dice=1; dice<=6; dice++){
            BoardPath(n, current + dice, ans+dice);
        }
    }

}
