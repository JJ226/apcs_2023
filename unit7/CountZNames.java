public class CountZNames{
    public static void testCountZNames(String[] names, int expected){
        int result = countZNames(names);
        System.out.println(" expected: " + expected + " result: " + result);
        if (result==expected)
            System.out.println("Everything has gone correctly in this function!");
        else
            System.out.println("Something has gone wrong in this function!");
    }
    public static int countZNames(String[] names){
        int counting=0;
        for (String x : names){
            if ((x.substring(0,1).equals("z")) || x.substring(0,1).equals("Z"))
                counting += x.length();
        }
        return counting;
    }
    public static void main (String[] args){
        String[] names1 = {"Dr. Kessner", "Dr. Sands"};
        String[] names2 = {"Zorro", "zero", "zippy"};

        testCountZNames(names1, 0);
        testCountZNames(names2, 14);
    }
}