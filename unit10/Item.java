public class Item{
    public Item(String name, double price){
        this.name = name;
        this.price = price;
    }
    public String name() {return name;}
    public double price() {return price;}
    
    private String name;
    private double price;
}