public class DieRolling{
    public static int rolling(){
        int roll =(int)(Math.random() *6 +1);
        return roll;
    }
    
    public static void main(String[] args){
        System.out.println("Roll: " + rolling());
    }
}