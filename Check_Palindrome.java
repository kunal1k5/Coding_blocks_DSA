package String;

import java.util.Scanner;

public class Check_Palindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        System.out.println(IsPalnidrome(str));
        
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
