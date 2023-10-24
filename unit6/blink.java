import processing.core.*;

public class Blink extends PApplet{
public void settings(){
    size (500,500);
}
public void setup(){
    f = new Face(this, 0, 1);
}
public void draw(){
    background (255);
    f.display();
}
    
public static void main(String[] args){
    PApplet.main("Blink");
    
}
    private Face f;
}
