import java.util.*;

public class PersonStats{
    
    public static int averagePets(ArrayList<Person> persons){
        int sum = 0;
        for (Person x : persons) //add .pets?
            sum += x.pets();
        return sum/persons.size();
    }
    
    public static String mostPets(ArrayList<Person> persons){
        int most = persons.get(0).pets();
        String mostString = persons.get(0).name();
        for (int i = 0; i < persons.size(); i ++) {
            if (persons.get(i).pets() > most){
                most = persons.get(i).pets();
                mostString = persons.get(i).name();
            }
        }
        return mostString;
    }
    
    public static ArrayList<Person> atLeast (ArrayList<Person> persons) {
        ArrayList<Person> howMany = new ArrayList<Person>();
        for (Person y: persons){
            if (y.pets()>=2)
                howMany.add(y);
        }
        return howMany;
    }
    public static void main (String[] args){
        ArrayList<Person> persons = new ArrayList<Person>();
        Person nola = new Person ("Nola", 1);
        Person jane = new Person ("Jane", 3);
        Person sarah = new Person ("Sarah", 2);
        persons.add(nola);
        persons.add(jane);
        persons.add(sarah);
        
        System.out.println ("Average number of pets: ");
        System.out.println (averagePets(persons));
        
        System.out.println ("Who has the most pets? ");
        System.out.println (mostPets(persons));
        
        System.out.println ("How many people have at least 2 pets: ");
        ArrayList<Person> howMany = atLeast(persons);

        for (Person z : howMany) {
            System.out.println(z.name());
        }
    }
}