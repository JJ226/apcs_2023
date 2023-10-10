public class StringTimes{
    public static void testStringTimes (String str, int n, String expected){
        String result = (stringTimes (str, n));
        System.out.println ("sentence:" + str + " number:" + n + " expected:" + expected + " result:" + result);
        if (expected.equals(result))
            System.out.println ("Nice job!");
        else
            System.out.println ("Oh no!");
    }
    public static String stringTimes(String str, int n) {
       String done = "";
        for (int i = 0; i<n; i++){
            done += str;
        } 
    return done;
}
    public static void main(String[] args){
        testStringTimes("hi",1,"hi");
        testStringTimes("code",2,"codecode");
        testStringTimes("hi",5,"hihihihihi");
    }
}