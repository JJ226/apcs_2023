public class ComputationsC {
    public static void main(String[] args){
        String[][] strings = new String[][] {{"Alabama", "hi"}, {"Alaska"}, {"Florida", "hoW aRe You DOing", "Arkansas"}};
        
        System.out.println("Number of strings that start with the letter 'A': " + startA(strings));
    }
    
    public static int startA (String[][] strings){
        int counting = 0;
        for (String[] x : strings){
            for (String y: x){
                if (y.substring(0,1).equals("A"))
                    counting+=1;
            }
        }
        return counting;
    }
}