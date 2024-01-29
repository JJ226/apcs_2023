public class ArrayInitializationD{
    public static void print (int[][] values){
        for (int row[]: values){
            for (int x: row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        int[][] values = new int[6][5];
        for (int i=0; i<6; i++)
        {
            for (int j=0; j<5; j++)
            {
             values[i][j] = i + 1;
            }
        }
        System.out.println("Values:");
        print(values);
    }
}