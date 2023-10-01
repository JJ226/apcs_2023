public class Greetings{
    public static void testGreetings(String name, String expected) {
        String result = greetings (name);
        System.out.println ("Name: " + name + "  expected: " + expected + "  result: " + result);
        if (expected.equals(result))
            System.out.println ("Correct!");
        else
            System.out.println ("Something's wrong...");
    }
        
    public static String greetings (String name){
        return ("Hello, " + name + ", how are you?");
    }
        
    public static void main (String[] args){
        testGreetings("Dr. Kessner", "Hello, Dr. Kessner, how are you?");
        testGreetings("Charlie Brown", "Hello, Charlie Brown, how are you?");
        testGreetings("Sydneys", "Hello, Sydneys, how are you?"); 
  }
}