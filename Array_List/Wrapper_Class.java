package Array_List;

public class Wrapper_Class {

    public static void main(String[] args) {
        
        // type casting -----
        int a = 10;
        Integer a1 = 10;
        Long l1 = 89l; // type casting;
        long l2 = 67;

        int b = 89;
        Integer b1 = 145;
        b1 = b;
        Float f = 18.9f;
        Double d = 6.8;
        Byte b4 = 7;

        Short s = 10;
        Character ch = 'a';
//----------------------------------------------------------------

        int a2 = 10;
        Integer a3 = 10;

        int b2 = 89;
        Integer b3 = 145;

        a3 = a2; // auto Boxing  

        b2 = b3;  // Unboxing

        System.out.println(b3);

        Integer c1 = 15;
        Integer c2 = 15;
        Integer c3 = 157;
        Integer c5 = 157;

        System.out.println(c1 == c2); // Integer ki range -128 to 127 hota so ye true hai
        System.out.println(c3 == c5);  // ye Integer ki range se bahar hai 
    }

    
}
