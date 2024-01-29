public class ArrayInitializationB{
    public static void print (String[][] input){
        for (String row[]: input){
            for (String x: row){
                System.out.println(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        String [][] letters = {{"A"}, {"B, C"}, {"D, E, F"}};
        System.out.println("Letters:");
        print(letters);
    }
}