public class MagicEightBall{
    public String ask (String question){
        double random = Math.random();
        if (random < 0.333)
            return "nope";
        else if (random < 0.666)
            return "Hmm... Maybe sometime in your future. Ask me in three days";
        else 
            return "yes";
    }
}