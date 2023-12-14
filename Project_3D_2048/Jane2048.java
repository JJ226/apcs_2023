import processing.core.*;
//import java.util.*;
//PeasyCam cam;

public class Jane2048 extends PApplet{
    public void settings(){
        size(600,600,P3D);
        //cam = new PeasyCam(this,400);
    }
    public void setup(){
       
    }
    public void draw(){
        background(255);
        drawBoxes();
    }
     public void keyPressed(){
        
     }
    public void drawBoxes(){
//        rect(30,30,190,190,p3D);
  //      line(0,0,400,0);
    //    stroke(0,255,0);
      //  line(0,0,0,400);
        //stroke(0,0,255);
        //line(0,0,0,0,0,400);
        stroke(0);
        box(200);
    }
    
    public static void main(String[] args){
    PApplet.main("Jane2048");
    }
}