import processing.core.*;
import java.util.*;

public class Ceramics extends PApplet{
    public void settings(){
        size(600,600);
    }
    public void setup(){
        design1 = new Wheel(this,100,50);
    }
    public void draw(){
        background(255);
        design1.starting();
        design1.update();
        
    }
     public void mouseDragged(){
         design1.mouseDragged();
     }
    
    public static void main(String[] args){
    PApplet.main("Ceramics");
    }
    private Wheel design1;
}