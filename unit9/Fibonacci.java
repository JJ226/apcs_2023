public class Fibonacci
{
    public static int[] fibonacci(int n){
        int a = 0;
        int b = 1;
        int sum = 1;
        int[] adding = new int[n];
        
        for (int i=0; i<n; i++){
            adding[i] = sum;
            a = b;
            b = sum;
            sum = a + b;
        }
        return adding;
    }
    public static void main (String[] args){
        int[] result = fibonacci(10);
        for (int x : result){
            System.out.println(x);
    }
    }
}
        