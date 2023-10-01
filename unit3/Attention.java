public class Attention{
    public static void testAttention(String string, boolean expected) {
        boolean result = attention (string);
        System.out.println ("sentence::" + string + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("Nice job!");
        else
            System.out.println ("Oh no!");
    }
        
    public static boolean attention (String string){
       if (string.substring(0,8).equals("Hey you!")){
           return true;
       }else{
           return false;
  }
    }
        
    public static void main (String[] args){
        testAttention("Hello, my name is Inigo Montoya.", false);
        testAttention("Excuse me, Dr. Kessner?", false);
        testAttention("Hey you! Give me your code!", true); 
  }
}