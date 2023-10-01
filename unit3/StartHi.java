public class StartHi{
    public static void testStartHi(String str, boolean expected) {
        boolean result = startHi (str);
        System.out.println ("Starting string:" + str + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("Success");
        else
            System.out.println ("Something's wrong...");
    }
        
    public static boolean startHi (String str){
       if (str.length() >= 2){
           if (str.substring(0,2).equals ("hi"))
               return true;
           else
               return false;
       }else{
           return false;
  }
    }
        
    public static void main (String[] args){
        testStartHi("hi there", true);
        testStartHi("hi", true);
        testStartHi("hello hi", false); 
  }
}