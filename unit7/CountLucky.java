public class CountLucky{
    public static void testCountLucky(int[] nums, int expected){
        int result = countLucky(nums);
        System.out.println(" expected: " + expected + " result: " + result);
        if (result==expected)
            System.out.println("WOOOOOOOOO!");
        else
            System.out.println("BOOOOOOOOO...");
        
    }
    public static int countLucky(int[] nums){
        int y=0;
        for (int x: nums){
            if (x%7==0)
                y+=1;
            else if (x%10==7)
                y+=1;
        }
        return y;
    }
    public static void main(String[] args){
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {7, 13, 17};
        int[] nums3 = {107, 217};

        testCountLucky(nums1, 0);
        testCountLucky(nums2, 2);
        testCountLucky(nums3, 2);
    }
}