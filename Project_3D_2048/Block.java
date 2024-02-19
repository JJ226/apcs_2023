import processing.core.*;
//import java.util.*;

public class Block{
    float x,y,z;
    int number;
    PApplet p;
    
    public Block(float xIn, float yIn, float zIn, int numberIn, PApplet p){ //
        this.y=yIn;
        this.x=xIn;
        this.z=zIn;
        this.p=p;
        this.number=numberIn;
    }
    public void display(){
        p.pushMatrix();
        p.translate(x,y,z);
        colors();
        p.box(75);
        p.popMatrix();
    }
    
    public void colors(){
        if (number == 2) 
            p.fill(220, 224, 223); // Grey
        else if (number == 4) 
            p.fill(255, 36, 36); // red
        else if (number == 8) 
            p.fill(255, 135, 36); //orange
        else if (number == 16) 
            p.fill(255, 207, 36); //yellow
        else if (number == 32) 
            p.fill(82, 227, 66); //green
        else if (number == 64) 
            p.fill(82, 227, 66); //blue
        else 
            p.fill(255);
    
    }
    
    public float getX(){
        return x;
    }
    
    public float getY(){
        return y;
    }
    
    public float getZ(){
        return z;
    }
    
    public int getNumber(){
        return number;
    } 

    public int changeNumber(){
        number *= 2;
        return number;
    }
    
    public void setX(float value, boolean upOrDown){
        if (upOrDown == true)
            x += value;
        else if (upOrDown == false)
            x -= value;
    }
    
    public void setY(float value, boolean upOrDown){
        if (upOrDown == true)
            y += value;
        else if (upOrDown == false)
            y -= value;
    }
    
    public void setZ(float value, boolean upOrDown){
        if (upOrDown == true)
            z += value;
        else if (upOrDown == false)
            z -= value;
    }
    /*  // all of this can be used for your moving of boxes i think
    public void updateX(){
        p.pushMatrix();
        
        p.popMatrix();
    }
    public void updateY(){
        p.pushMatrix();
        
        p.popMatrix();
    }
    public void updateZ(){
        p.pushMatrix();
        
        p.popMatrix();
    }
    */
}