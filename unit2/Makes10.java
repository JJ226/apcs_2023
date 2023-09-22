public class Makes10
{
    public static void testMakes10 (int a, int b, boolean expected) 
    {
        boolean result = makes10 (a,b);
        System.out.println (" int a:" + a + " int b:" + b + " expected:" + expected + " result:" + result);
    }
    
    public static boolean makes10(int a, int b) 
    {
          if (a == 10 || b == 10 || a+b == 10)
            return true;
          else 
            return false;
    }
    
    
    public static void main (String[] args){
        {
            testMakes10 (9,10,true);
            testMakes10 (9,9,false);
            testMakes10 (1,9,true);
        }
    }
}