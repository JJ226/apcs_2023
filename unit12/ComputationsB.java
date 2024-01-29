public class ComputationsB {
    public static void main(String[] args){
        float[][] values = new float[][] {{1,1,1}, {2,3,4,7}, {6, 2}};
        
        System.out.println("Sum: " + sum(values));
    }
    
    public static float sum (float[][] values){
        float sum = values[0][0];
        for (float[] x : values){
            for (float y: x){
                sum += y;
            }
        }
        return sum;
    }
}