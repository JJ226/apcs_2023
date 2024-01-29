public class ArrayInitializationC{
    public static void print (double[][] values){
        for (double row[]: values){
            for (double x: row){
                System.out.print(x + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
    
    public static void main (String[] args){
        double[][] values = new double[5][5];
        for (int i=0; i<5; i++)
        {
            for (int j=0; j<5; j++)
            {
                values[i][j] = i * 10 + j + 1 + 10;
            }
        }
        System.out.println("Values:");
        print(values);
    }
}