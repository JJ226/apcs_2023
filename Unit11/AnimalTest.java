import java.util.*;


public class AnimalTest
{
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Whale("Willy", 17, false));
        animals.add(new Bumblebee("Buzzy", 6, true));
        animals.add(new Snake("Slithery", 0, false));
        animals.add(new Bat("Snoozy", 2, true));

        for (Animal x : animals)
        {
            System.out.println(x.getName());
            System.out.println(x.getLegCount());
            System.out.println(x.getIsFurry());
            System.out.println();
        }
    }
}

