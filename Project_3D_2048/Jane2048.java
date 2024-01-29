import processing.core.*;
import java.util.*;
import peasy.*;


//for x this is the base: 350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700
public class Jane2048 extends PApplet{
    PeasyCam cam;

    private boolean needFill = false;
    private boolean has2048 = false;
    
    private ArrayList<Block> blockList;
    
    public static void main(String[] args){
    PApplet.main("Jane2048");
    }
    public void settings(){
        fullScreen(P3D);
    }
    public void setup(){
        blockList = new ArrayList<Block>();
        cam = new PeasyCam(this,400);
    }
    public void draw(){
        background(255);
        noFill();
        //drawBoxes();
        for (int column=0;column<4;column++){
            for (int row=0;row<4;row++){
                for (int zAxis=0;zAxis<4;zAxis++){
                    pushMatrix();
                    translate((0 + row*80), (0 + column*80), (-500 + zAxis*80));
                    stroke(0);
                    box(75);
                    popMatrix(); //215 instead of w/4
                    //540
                }
            }
        }
        for (Block x : blockList)
            x.display();
        
    }
     public void keyPressed(){
        int randoX = (int) (Math.random() * 4);
        int randoY = (int) (Math.random() * 4);
        int randoZ = (int) (Math.random() * 4);
        Block addingBlock = new Block(0 + randoX*80, 0 + randoY*80, -500 + randoZ*80, this);
        
        blockList.add(addingBlock); 
         //you can use these for moving blocks around
            if(keyCode == UP || key == 'w'){
                
                if (randoY != 0){
                    for (Block y : blockList){
                        y.getY();
                        if (y.getY() == 0) {}
                        
                        else {
                            y.setY(80,false);
                    }
                    
                }
                }
            }
        if(keyCode == DOWN || key == 's'){
            if (randoY != 0){
                    for (Block y : blockList){
                        y.getY();
                        if (y.getY() == 3*80) {}
                        
                        else {
                            y.setY(80,true);
                    }
                    }
                }
        }
        if(keyCode == LEFT || key == 'a'){
            if (randoX != 0){
                    for (Block x : blockList){
                        x.getX();
                        if (x.getX() == 0) {}
                        
                        else {
                            x.setX(80,false);
                    }
                        
                    }
                }
        }
        if(keyCode == RIGHT || key == 'd'){
             if (randoX != 0){
                    for (Block x : blockList){
                        x.getX();
                        if (x.getX() == 3*80) {}
                        
                        else {
                            x.setX(80,true);
                    }
                        
                    }
                }
        }
         
        /* if(key == 'q'){
             if (randoZ != -520){
                    for (Block x : blockList){
                        x.getX();
                        if (x.getX() == 3*80) {}
                        
                        else {
                            x.setX(80,true);
                    }
                        
                    }
                }
        }
        */
        
     }
}


    
    
