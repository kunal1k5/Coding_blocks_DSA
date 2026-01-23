package String;

public class Sub_String {
    
    public static void main(String[] args) {
        
        String str = "83415";

        SubString(str);
    }

    public static void SubString(String str){

        for(int length=1; length<=str.length(); length++){
            for(int j=length; j<=str.length(); j++){
                int i = j-length;
                System.out.println(str.substring(i,j) + " ");
            }

        }
    }
}
