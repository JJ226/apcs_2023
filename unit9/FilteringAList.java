import java.util.*;

public class FilteringAList{
    public static void testFilteringAList(ArrayList<Integer> in){
        int result = filteringAList(in);
        System.out.println ("result: " + result);
    }
    public static void main(String[] args){
        ArrayList<Integer> nums1 = new ArrayList<Integer>(); 
        nums1.add(51);
        nums1.add(52);
        nums1.add(53);
        nums1.add(100);
        
        ArrayList<Integer> nums2 = new ArrayList<Integer>(); 
        nums2.add(92);
        nums2.add(89);
        nums2.add(90);
        nums2.add(99);

        testFilteringAList(nums1);
        testFilteringAList(nums2);
    }
    public static int filteringAList(ArrayList<Integer> input){
        int counting = 0;
        for (int x : input) {
            if (x>=90)
                counting+=1;
        }
        return counting;
    }
}