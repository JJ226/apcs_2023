import java.util.*;

public class MaximumValue{
    public static void testMaximumValue(double[] in){
        double result = maximumValue(in);
        System.out.println ("result: " + result);
    }
    public static void main(String[] args){
        double[] nums1 = {1.0, 2.1, 5.3};
        double[] nums2 = {0, -35, 90.1};

        testMaximumValue(nums1);
        testMaximumValue(nums2);
    }
    public static double maximumValue(double[] input){
        double counting = input[0];
        for (double x : input) {
            if (x>counting)
                counting=x;
        }
        return counting;
    }
}