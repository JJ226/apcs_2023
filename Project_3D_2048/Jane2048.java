import processing.core.*;
import peasy.*;
import java.util.*;

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
        addBlock();
        addBlock();
    }
    public void draw(){
        background(255);
        noFill();
        drawAxes();
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
        
        for (Block x : blockList) {
            x.display();
        }
    }
    public void addBlock(){
        int randoX = (int) (Math.random() * 4);
        int randoY = (int) (Math.random() * 4);
        int randoZ = (int) (Math.random() * 4);
        Block addingBlock = new Block(0 + randoX*80, 0 + randoY*80, -500 + randoZ*80, 2, this);
        
        blockList.add(addingBlock); 
    }
    
    public void changeNumber(){
        System.out.println(blockList.get(0).getNumber());
        blockList.get(0).changeNumber();
        System.out.println(blockList.get(0).getNumber());
    }
    
    public void keyPressed(){
            if(keyCode == UP || key == 'w'){
                    for (Block y : blockList){
                        y.getY();
                        if (y.getY() == 0) {}
                        
                        else {
                            y.setY(80,false);
                    }
                    
                }
            }
        if(keyCode == DOWN || key == 's'){
                    for (Block y : blockList){
                        y.getY();
                        if (y.getY() == 3*80) {}
                        
                        else {
                            y.setY(80,true);
                    }
                    }
        }
        if(keyCode == LEFT || key == 'a'){
                    for (Block x : blockList){
                        x.getX();
                        if (x.getX() == 0) {}
                        
                        else {
                            x.setX(80,false);
                    }
                        
                    }
        }
        if(keyCode == RIGHT || key == 'd'){
                    for (Block x : blockList){
                        x.getX();
                        if (x.getX() == 3*80) {}
                        
                        else {
                            x.setX(80,true);
                    }
                        
                    }
        }
         
         if(key == 'q'){
                    for (Block z : blockList){
                        z.getZ();
                        if (z.getZ() == -500) {}
                        
                        else {
                            z.setZ(80,false);
                    }
                        
                    }
        }
         
         if(key == 'e'){
                    for (Block z : blockList){
                        z.getZ();
                        if (z.getZ() == -500 + 3*80) {}
                        
                        else {
                            z.setZ(80,true);
                    }
                        
                    }
        }
        addBlock();
        
    }
void drawAxes(){
  stroke(255,0,0);
  line(0,0,400,0);
  stroke(0,255,0);
  line(0,0,0,400);
  stroke(0,0,255);
  line(0,0,0,0,0,400);
}
}



    
    
