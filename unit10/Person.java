public class Person{
    public Person (String name, int pets){
        this.name = name;
        this.pets = pets;
    }
    public String name() {return name;}
    public int pets() {return pets;}
    
    private String name;
    private int pets;
}