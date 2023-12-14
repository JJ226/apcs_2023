import processing.core.*;
//import java.util.*;

public class Ceramics extends PApplet{
    public void settings(){
        size(600,600);
    }
    public void setup(){
        Wheel design1 = new Wheel(this,100,50,200,400);
//        Wheel design2 = new Wheel(this,100,50,200,390);
  //      Wheel design3 = new Wheel(this,100,50,200,380);
    //    Wheel design4 = new Wheel(this,100,50,200,370);
      //  Wheel design5 = new Wheel(this,100,50,200,360);
        design1.starting();
    }
    public void draw(){
        background(255);
        design1.update();
        
        //System.out.println(design1.ellipseDist(200,400,0,0));
        
    }
     public void mouseDragged(){
         design1.mouseDragged();
     }
    
    public static void main(String[] args){
    PApplet.main("Ceramics");
    }
    private Wheel design1;
}