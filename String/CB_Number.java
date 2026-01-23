package String;

public class CB_Number {

    public static void main(String[] args){

        String str = "692239";
        System.out.println(PrintSubString(str));

    }

     public static int PrintSubString(String str){
        int count =0;
        boolean[] visited = new boolean[str.length()];
        for(int length=1; length<=str.length(); length++){
            for(int j=length; j<=str.length(); j++){
                int i = j-length;
                String str1 = str.substring(i,j);

                // String ko integer me convert karna hai
                // Integer.parseInt(s1); -- number wali String ko Integer me convert karega
                
                Long n = Long.parseLong(str1);
                if(isCbNumber(n)==true && Isvalid(visited,i,j)){
                    count++;
                    // i to j-1 ---> marked ye cb bana chuke hai

                    for(int k=i; k<j; k++){

                        visited[k] = true;
                    }

                }
                
            }

        }
        return count;
    }

    public static boolean isCbNumber(long num){
        if(num== 0 || num==1){
            return false;
        }
        int[] arr = {2,3,5,7,11,13,17,19,23,29};
        for(int i=0; i<arr.length; i++){
            if(num == arr[i]){
                return true;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(num % arr[i] == 0){
                return false;
            }
        }
        return true;
    }

    public static boolean Isvalid(boolean[] visited,int i, int j) {
       
        for(; i<j; i++){
            if(visited[i] == true){
                return false;

            }
        }
        return true;
    }
    
}
