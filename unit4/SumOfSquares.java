public class SumOfSquares{
    public static void testSumOfSquares (int num, int expected){
        int result = sumOfSquares (num);
        System.out.println ("number:" + num + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("Nice!");
        else
            System.out.println ("Nope!");
    }
    public static int sumOfSquares(int num) {
       int endNum = 0;
        for (int i=0; i<=num; i++){
            endNum+=i*i;
        }
        return endNum;
}
    public static void main(String[] args){
        testSumOfSquares(1,1);
        testSumOfSquares(2,5);
        testSumOfSquares(3,14);
        testSumOfSquares(4,30);
        testSumOfSquares(5,55);
    }
}
