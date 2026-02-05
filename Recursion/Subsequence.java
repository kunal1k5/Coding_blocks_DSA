public class Subsequence {
    public static void main(String[] args) {
        String ques = "abc";
        SubSeq(ques,"");
    }

    public static void SubSeq(String ques,String ans){

        if(ques.length()==0){
            System.out.print(ans+" ");
            return;
        }

        char ch = ques.charAt(0);
        SubSeq(ques.substring(1), ans);
        SubSeq(ques.substring(1), ans+ch);

    }
}
