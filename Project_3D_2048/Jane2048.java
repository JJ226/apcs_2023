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
        size(860,860,P3D);
        
    }
    public void setup(){
        blockList = new ArrayList<Block>();
        cam = new PeasyCam(this,400);
    }
    public void draw(){
        background(255);
        noFill();
        //drawBoxes();
        for (int column=1;column<5;column++){
            for (int row=1;row<5;row++){
                for (int zAxis=1;zAxis<5;zAxis++){
                    pushMatrix();
                    translate((width / 4 + row*80), (height / 4 + column*80), (zAxis*80));
                    stroke(0);
                    box(75);
                    popMatrix();
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
        Block addingBlock = new Block(width/3 + randoX*80, height/3 + randoY*80, randoZ*80, this);
        
        blockList.add(addingBlock); 
     }
}

    
    
