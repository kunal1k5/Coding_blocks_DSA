public class Count_SubSequence {
    public static void main(String[] args){
        String ques = "abc";
        
        System.out.print("\n"+PrintSubSeqCount(ques, ""));
    }
    //static int count = 0;
    public static int PrintSubSeqCount(String ques,String ans){
        if(ques.length() == 0){
            System.out.print(ans+" ");
            //count++;
            return 1;
        }
        char ch = ques.charAt(0);
        int a1 = PrintSubSeqCount(ques.substring(1), ans);
        int b1 = PrintSubSeqCount(ques.substring(1), ans+ch);
        return a1+b1;
    }
}
