public class Reverse{
    public static void testReverse (String str, String expected){
        String result = reverse (str);
        System.out.println ("Original:" + str + " expected:" + expected + " result:" + result);
        if (expected.equals(result))
            System.out.println ("Yippee!");
        else
            System.out.println ("NOPE");
    }
    public static String reverse(String str) {
    String reversing = "";
    for (int i=str.length()-1; i>=0; i--){
        reversing += str.substring(i,i+1);
  }
    return reversing;
}
    public static void main(String[] args){
        testReverse("bad","dab");
        testReverse("Hello, world!","!dlrow ,olleH");
        testReverse("tacocat","tacocat");
        testReverse("coding","gnidoc");
        testReverse("abcdefg","gfedcba");
    }
}
