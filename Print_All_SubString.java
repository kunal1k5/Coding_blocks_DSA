package String;

public class Print_All_SubString{

    public static void main(String[] args) {
        
        String s = "nitin";
        PrintSubString(s);
    }

    public static void PrintSubString(String str){

        for(int i=0; i<str.length(); i++){
            for(int j=i+1; j<= str.length(); j++){
                
                String SubStr = str.substring(i,j);
                
                
                    System.out.println(IsPalnidrome(SubStr));
                
            }
        }
    }
     public static boolean IsPalnidrome(String str){
        int i =0;
        int j= str.length()-1;

        while(i<j){
            if(str.charAt(i) != str.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}