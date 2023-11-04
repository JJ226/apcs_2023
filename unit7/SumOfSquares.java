public class SumOfSquares{
    public static void testSumOfSquares(double[] nums, double expected){
        double result = sumOfSquares(nums);
        System.out.println(" expected: " + expected + " result: " + result);
        if (result==expected)
            System.out.println("Corect!");
        else
            System.out.println("Wrong.");
        
    }
    public static double sumOfSquares(double[] nums){
       double y = 0;
        for(double x:nums){
            y += x*x;
        }
        return y;
    }
    public static void main(String[] args){
        double[] nums1 = {0};
        double[] nums2 = {1.0, 2.0, 3.0};
        double[] nums3 = {2.0, 2.0, 2.0};

        testSumOfSquares(nums1, 0);
        testSumOfSquares(nums2, 14.0);
        testSumOfSquares(nums3, 12.0);
    }
}