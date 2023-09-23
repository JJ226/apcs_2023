public class IsVampire{
    public static void testIsVampire(float hour, boolean awake, boolean expected) {
        boolean result = isVampire (hour, awake);
        System.out.println (" hour:" + hour + " awake:" + awake + " expected:" + expected + " result:" + result);
    }
        
    public static boolean isVampire (float hour, boolean awake){
        if (awake == false){
            if (hour > 6 && hour < 22)
                return true;
            else
                return false;
        }
        else if(awake == true){
            if (hour < 6 && hour > 22)
                return true;
            else
                return false;
        }
        else {
            return false;
        }
    }
        
    public static void main (String[] args){
        testIsVampire (7, true, false);
        testIsVampire (3, true, false);
        testIsVampire (9, false, true);
    }
}