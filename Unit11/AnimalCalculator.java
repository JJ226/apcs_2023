import java.util.*;

public class AnimalCalculator{
    public static void main(String[] args){
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Whale("Willy", 17, false));
        animals.add(new Bumblebee("Buzzy", 6, true));
        animals.add(new Snake("Slithery", 0, false));
        animals.add(new Bat("Snoozy", 2, true));
        
        System.out.println("Information on all animals: ");
        info(animals);
        
        System.out.println("Average legs: " + avgLegs(animals));
        
        System.out.println("Animal with the least legs: " + leastLegs(animals));
    }
    
    public static void info(ArrayList<Animal> animals){
        for (Animal x : animals)
        {
            System.out.println(x.getName());
            System.out.println(x.getLegCount());
            System.out.println(x.getIsFurry());
            System.out.println();
        }
    }
    
    public static int avgLegs (ArrayList<Animal> animals){
        int count = 0;
        for (Animal x : animals)
        {
            count += x.getLegCount();
        }
        return count/animals.size();
    }
    
    public static String leastLegs(ArrayList<Animal> animals){
        int countInt = animals.get(0).getLegCount();
        String countString = animals.get(0).getName();
        for (Animal x : animals) {
            if (x.getLegCount() < countInt)
                countInt = x.getLegCount();
                countString = x.getName();
        }
        return countString;
    }
}
