import java.util.*;

public class ZNameLength{
    public static void testZNamesLength(ArrayList<String> names, int expected){
        int result = zNamesLength(names);
        System.out.println(" expected: " + expected + " result: " + result);
        if (result==expected)
            System.out.println("Correct!");
        else
            System.out.println("WRONG!");
    }
    public static int zNamesLength(ArrayList<String> names){
        int counting=0;
        for (String x : names){
            if ((x.substring(0,1).equals("z")) || x.substring(0,1).equals("Z"))
                counting += x.length();
        }
        return counting;
    }
    public static void main (String[] args){
        ArrayList<String> names1 = new ArrayList<String>();
        names1.add("Dr. Kessner");
        names1.add("Dr. Sands");
        
        ArrayList<String> names2 = new ArrayList<String>();
        names2.add("zorro");
        names2.add("zippy");
        names2.add("zero");

        testZNamesLength(names1, 0);
        testZNamesLength(names2, 14);
    }
}