import java.util.*;

public class ShapeCollection{
    static ArrayList<Shape> shapes = new ArrayList<Shape>();
   
    public static void addShape(String name, int numSides){
        Shape newShapeYay = new Shape (name, numSides);
        shapes.add(newShapeYay);
    }
    
    public static int numberOfSides(String shapeName){
        int currentSides = 0;
        for (Shape x : shapes){
            if (x.getName().equals(shapeName))
                currentSides = x.getNumSides();
        }
        return currentSides;
    }
    
    public static double avgSideNum(ArrayList<Shape> shapey){
        double count = 0;
        double total = 0;
        for (Shape x : shapey){
            count += x.getNumSides();
            total += 1;
        }
        return count/total;
    }
    
    public static ArrayList<Shape> evens(ArrayList<Shape> shapey){
        ArrayList<Shape> evenShapes = new ArrayList<Shape>();
        for (Shape x : shapey){
            if (x.getNumSides()%2 == 0)
                evenShapes.add(x);
        }
        return evenShapes;
    }
    
    public static void main(String[] args){
            
        addShape("Bob", 3);
        addShape("jeanette",7);
        addShape("tony", 8);
        addShape("quad",4);
        
        System.out.println("Jeanette's number of sides: ");
        System.out.println(numberOfSides("jeanette"));
        System.out.println("Shapes with an even number of sides: ");
        for (Shape x : evens(shapes))
            System.out.println (x.getName());
        
        System.out.println("Average number of sides: ");
        System.out.println(avgSideNum(shapes));
    }
}