public class Coin_Toss_No_Head {

    public static void main(String[] args) {
        int coin = 3;
        CoinTossNoHead(coin, "");
    }

    public static void CoinTossNoHead(int coin, String ans){
        if(coin==0){
            System.out.print(ans+" ");
            return;
        }

        if(ans.length()==0 || ans.charAt(ans.length()-1) != 'H'){
            CoinTossNoHead(coin -1, ans + "H");
        }
        CoinTossNoHead(coin-1, ans + "T");
    }
    
}
