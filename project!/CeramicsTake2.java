import processing.core.*;
import peasy.*;

//import java.util.*;

public class CeramicsTake2 extends PApplet{
    PeasyCam cam;
    public void settings(){
        size(600,600,P3D);
        cam = new PeasyCam(this,400);
    }
    public void setup(){
        
    }
    public void draw(){
        background(255);
        
    }
     public void mouseDragged(){
         design1.mouseDragged();
     }
    
    public static void main(String[] args){
    PApplet.main("CeramicsTake2");
    }
    //private Wheel design1;
}

public class Clay extends PApplet{
    public Clay(PApplet p, float xIn, float yIn, float widthIn, float heightIn){
        this.yIn=y;
        this.xIn=x;
        this.widthIn=width;
        this.heightIn=height;
        this.p=p;
    }
    public void display(){
    p.line (250,450,30,400,450,30);
    }
}


