package Strings;

public class NEW_Practice {

    public static boolean isPrefix(String a , String b ){
        int i = 0 ; 
        int j = 0 ;
        while (i < a.length() && j < b.length()) {
            if (a.charAt(i)!= b.charAt(j)) {
                return false;
            } else{
                i++ ;
                j++;
            }
        }

        return true;
    }

    public static String isPrefex_2(String a , String b){
        StringBuilder ans = new StringBuilder("");
        int i = 0 ; 
        int j = 0 ;
        while (i < a.length() && j < b.length() ) {
           if (a.charAt(i)== b.charAt(j)) {
            ans.append(a.charAt(i));
           i++;
           j++;
           }
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        
    // String a = "pankaj" ;
    String b = "pank";

    // System.out.println(isPrefix(a, b));

    // System.out.println(isPrefex_2(a,b));


        // System.out.println("oankaj".charAt(5));
    //    System.out.println( "pankaj".indexOf('k'));

    //    String a = new String("Pankaj Thakur Loves Monika:");
    //    String sub = "Mo";

    //    System.out.println(a.indexOf(sub , 20));
     


    }
}
