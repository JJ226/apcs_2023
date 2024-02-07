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
        p.fill(252, 56, 56);
        p.translate(x,y,z);
        p.box(75);
        p.popMatrix();
    }
    
    public void colors(){
            if (number == 2)
                p.fill (155);
            else if (number == 4)
                p.fill (0);
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