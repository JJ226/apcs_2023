public class Factorial{
    public static void testFactorial (int num, int expected){
        int result = factorial (num);
        System.out.println ("number:" + num + " expected:" + expected + " result:" + result);
        if (expected == result)
            System.out.println ("You did it :)");
        else
            System.out.println ("Aw, something's wrong...");
    }
    public static int factorial(int num) {
       int endNum = 1;
        for (int i=1; i<=num; i++){
            endNum*=i;
        }
        if(endNum==0)
            return 1;
        else
            return endNum;
}
    public static void main(String[] args){
        testFactorial(0,1);
        testFactorial(1,1);
        testFactorial(2,2);
        testFactorial(3,6);
        testFactorial(4,24);
        testFactorial(5,120);
    }
}
