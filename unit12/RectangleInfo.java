public class RectangleInfo {
    public static void main(String[] args){
        Rectangle[][] rectangles = new Rectangle[][] {{new Rectangle("rectangle one", 2, 3)}, {new Rectangle ("rectangle two", 5, 2)}, {new Rectangle("Bob", 3, 10)}};
        
        System.out.println("Average perimeter: " + averagePerimeter(rectangles));
        
        System.out.println("The rectangle with the largest area is: " + largestArea(rectangles).getName());
    }
    
    public static double averagePerimeter (Rectangle[][] rectangles){
        double perimeters = 0;
        for (Rectangle[] x : rectangles){
            for (Rectangle y: x){
                perimeters+=y.perimeter();
            }
        }
        return perimeters/rectangles.length;
    }
    
    public static Rectangle largestArea (Rectangle[][] rectangles){
        double greatestAreaCurrent = rectangles[0][0].area();
        Rectangle rectangle = rectangles[0][0];
        for (Rectangle[] x : rectangles){
            for (Rectangle y: x){
                if (y.area()>greatestAreaCurrent)
                    greatestAreaCurrent = y.area();
                    rectangle = y;
            }
        }
        return rectangle;
    }
}