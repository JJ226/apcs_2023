public class CountOccurrences{
    public static void testCountOccurrences (String str, String given, int expected){
        int result = countOccurrences (str,given);
        System.out.println ("sentence:" + str + " Looking for:" + given + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("YESSSSSS!");
        else
            System.out.println ("Not quite...");
    }
    public static int countOccurrences(String str,String given) {
    int count = 0;
    for (int i=0; i<=str.length() - given.length(); i++){
        if ((str.substring(i,i+given.length())).equals(given))
        count += 1;
  }
    return count;
}
    public static void main(String[] args){
        testCountOccurrences("Mississippi","iss",2);
        testCountOccurrences("banananana","na",4);
        testCountOccurrences("hellohellohello","lo",3);
        testCountOccurrences("lalalalala","la",5);
        testCountOccurrences("My name is","Jane",0);
    }
}
