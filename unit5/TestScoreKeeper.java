public class TestScoreKeeper{
    public static void main(String[] args){
     ScoreKeeper Player1 = new ScoreKeeper();
        System.out.println (Player1.getScore());
        Player1.scoreNormal();
        Player1.scoreNormal();
        Player1.scoreBonus();
        System.out.println (Player1.getScore());
}
}