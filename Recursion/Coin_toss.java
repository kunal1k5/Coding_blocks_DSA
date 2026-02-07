public class Coin_toss {
    public static void main(String[] args) {
        int coin = 3;
       // CoinToss(coin, "");
        System.out.println("\n"+CoinToss(coin, ""));
    }

    public static int CoinToss(int coin,String ans){

        if(coin==0){
            System.out.print(ans + " ");
            return 1;
        }
        int a1 = CoinToss(coin-1, ans+"H");
        int a2 = CoinToss(coin-1, ans+"T");
        return a1+a2;     
    }
}
