public class Rectangle{
    private double base;
    private double height;
    public Rectangle (double INbase, double INheight){
        base = INbase;
        height = INheight;
    }
    public double area (){
        return (base * height);
    }
    public double perimeter(){
        return (base + base + height + height);
    }
    public double diagonal(){
        return (Math.sqrt((base*base)+(height*height)));
    }   
}