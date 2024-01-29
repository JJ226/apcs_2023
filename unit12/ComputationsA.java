public class ComputationsA {
    public static void main(String[] args){
        int[][] values = new int[][] {{2, 6, 6, 5}, {9, 1, 1, 4}, {6, 0}};
        
        System.out.println("Smallest: " + smallest(values));
    }
    
    public static int smallest (int[][] values){
        int smallest = values[0][0];
        for (int[] x : values){
            for (int y: x){
                if (y<smallest)
                    smallest = y;
            }
        }
        return smallest;
    }
}