import java.util.*;

public class ItemCalculator{
    
    public static void main (String[] args) {
        
        Item canOfBeans = new Item ("Can of Beans", 3.50);
        Item cherry = new Item ("Cherry", 1);
        Item cakeMix = new Item ("Cake Mix", 6.95);
        
        ArrayList<Item> items = new ArrayList<Item>();
        
        items.add(canOfBeans);
        items.add(cherry);
        items.add(cakeMix);
        
        System.out.println ("List of names and prices: ");
        nameAndPrice(items);
        
        System.out.println ("Average price: ");
        System.out.println (averagePrice(items));
        
        System.out.println ("Most expensive item: ");
        System.out.println (expensive(items));
        
    }
    
    public static void nameAndPrice(ArrayList<Item> items){
        for (Item x : items)
            System.out.println(x.name() + " " + x.price());
    }
    
    public static double averagePrice(ArrayList<Item> items){
        double sum = 0;
        for (Item y : items)
            sum+=y.price();
        return sum /items.size();
    }
    
    public static double expensive(ArrayList<Item> items){
        double mostExpensive = items.get(0).price();
        for (int i = 0; i<items.size(); i++) {
            if (items.get(i).price()>mostExpensive)
                mostExpensive = items.get(i).price();
        }
        return mostExpensive;
    }
}

