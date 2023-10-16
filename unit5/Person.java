public class Person{

    public Person (String nameIN, int petsIN){
        name = nameIN;
        pets = petsIN;
    }
    public void greeting(){
        System.out.println ("Hello, my name is " + name + " and I have " + pets + " pets.");
    }
    private int pets;
    private String name;
}