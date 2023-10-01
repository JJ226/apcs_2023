public class HasTeen{
    public static void testHasTeen(int a, int b, int c, boolean expected) {
        boolean result = hasTeen (a, b, c);
        System.out.println (" a:" + a + " b:" + b + " c:" + c + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("YAYYY!");
        else
            System.out.println ("oh no :(");
    }
        
    public static boolean hasTeen (int a, int b, int c){
       if (a <= 19 && a >= 13 || b <= 19 && b >= 13 || c <= 19 && c>= 13)
           return true;
        else
            return false;
    }
        
    public static void main (String[] args){
        testHasTeen (13, 20, 10, true);
        testHasTeen (20, 19, 10, true);
        testHasTeen (12, 9, 20, false);
    }
}