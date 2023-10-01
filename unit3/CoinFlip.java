public class CoinFlip{
    public static String coinFlip(){
        int side = (int)(Math.random() *2);
        if (side == 0) 
            return "heads";
        
        else
            return "tails";
    }
    
    public static void main (String[] args){
        for (int i = 0; i <20; i++)
            System.out.println("Flip: " + coinFlip());
    }
}