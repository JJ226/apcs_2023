public class Fibonacci
{
    public static void main(String[] args)
    {
        int a = 0;
        int b = 1;
        int sum = 1;
        
        for (int i = 0; i < 30; i++){
            System.out.println (sum);
            a = b;
            b = sum;
            if (a < 0)
                a = 1;
            if (b < 0)
                b = 1;
            sum = a + b;
            
        }
        }
    }