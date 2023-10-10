public class DoubleX{
    public static void testDoubleX (String str, boolean expected){
        boolean result = doubleX (str);
        System.out.println ("sentence:" + str + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("Woohoo!");
        else
            System.out.println ("WahWahWahh!");
    }
    public static boolean doubleX(String str) {
  for (int i=0; i<=str.length() -2; i++){
    if (str.substring(i,i+1).equals("x")){
      if ((str.substring(i,i+2)).equals("xx"))
        return true;
        }
    }
        return false;
}
    public static void main(String[] args){
        testDoubleX("axxb",true);
        testDoubleX("axaxax",false);
        testDoubleX("xxxxx",true);
    }
}
