package String;

public class Compare_To {

    public static void main(String[] args) {
        
        String s1 = "kamal";
        String s2 = "komal";

        // inbuild function for compare -------

        System.out.println(s1.compareTo(s2));
        System.out.println(CompareTO(s1, s2));
    }

    public static int CompareTO(String s1, String s2) {
        
        if(s1 == s2){
            return 0;
        }
        for(int i=0; i<Math.min(s1.length(), s2.length()); i++){

            if(s1.charAt(i) != s2.charAt(i)){
                return s1.charAt(i) - s2.charAt(i); // if value negative aya then s2 > s1 and value positive aaya to s1>s2

            }
        }
        return s1.length() - s2.length();
    }
    
}
