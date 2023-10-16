public class TestMagicEightBall{
    public static void main (String[] args){
        MagicEightBall q1 = new MagicEightBall();
        String question = "Is my name Jane?";
        System.out.println (question + ": " + q1.ask(question));
    }
}