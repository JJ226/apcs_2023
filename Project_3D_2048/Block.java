import processing.core.*;
//import java.util.*;

public class Block{
    float x,y,z;
    PApplet p;
    
    public Block(float xIn, float yIn, float zIn, PApplet p){
        this.y=yIn;
        this.x=xIn;
        this.z=zIn;
        this.p=p;
    }
    public void display(){
        p.pushMatrix();
        p.fill(252, 56, 56);
        p.translate(x,y,z);
        p.box(75);
        p.popMatrix();
    }
}