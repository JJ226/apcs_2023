/*public class SimpleCombine(){
    public SimpleCombine(ArrayList<Integer> ints){
        this.ints=ints;
    }
    for (int i = )
}*/
import java.util.*;
public class SimpleCombine {

    public static ArrayList<Integer> combineToLeft(ArrayList<Integer> ints) {
        
        
        // Combine to the left by multiplying adjacent equal numbers by 2
        for (int i = 0; i < ints.size() - 1; i++) {
            if (ints.get(i) == ints.get(i + 1)) {
                ints.set(i, ints.get(i)*2);
                ints.set(i + 1, 0);
            }
        }

        // Shift all non-zero numbers to the left
        int currentIndex = 0;
        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) != 0) {
                if (ints.get(i-1) == 0){
                    ints.set(i-1, ints.get(i)); 
                    ints.set(i, 0);
                }
            }
        }
        
        return ints;
    }

    public static void main(String[] args) {
        // Example usage
        ArrayList<Integer> inputs = new ArrayList<Integer>();
        inputs.add(2);
        inputs.add(2);
        inputs.add(4);
        inputs.add(4);
        ArrayList<Integer> inputs2 = new ArrayList<Integer>();
        inputs2.add(0);
        inputs2.add(2);
        inputs2.add(2);
        inputs2.add(0);
        
        
        System.out.println("Original Numbers: " + inputs + "Combined: " + combineToLeft(inputs));
        
        System.out.println("Original Numbers: " + inputs2 + "Combined: " + combineToLeft(inputs2));
    }
}