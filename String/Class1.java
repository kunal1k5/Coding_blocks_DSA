package String;

public class Class1 {

    public static void main(String[] args) {
        String str = "Hello";
        String str1 = new String("Hello");
        String str2 = "Hello";
        String str3 = new String("Hello");
        System.out.println(str);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str.charAt(2));

        String s4 = "hey";
        String s5 = "bye";
        s4=s4+s5;
        String str6 = new String("hello");

        System.out.println(str == str1);
        System.out.println(str == str2);
        System.out.println(str1 == str3);

        System.out.println(str.equals(str1)); // both content same hai
 
        String s1 = "Helol";
        String s2 = new String("Hello");

        System.out.println(equals(s1, s2));


        // SUB STRING -----------\

        String s3 = "jdkadknkand";
        System.out.println(s3.substring(1,3));
        System.out.println(s3.substring(5));
        



    }
    public static boolean equals(String s1, String s2){
        if(s1 == s2){
            return true;
        }
        if(s1.length() != s2.length()){
            return false;
        }
        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i) != s2.charAt(i)){
                return false;
            }
        }
        return true;
    }
    
}
