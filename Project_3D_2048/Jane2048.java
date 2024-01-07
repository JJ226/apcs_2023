import processing.core.*;
import java.util.*;
//PeasyCam cam;




//for x this is the base: 350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700
public class Jane2048 extends PApplet{
    //int[][][] drawBoxes = {{350, 175, 0}, {525, 175, 0}, {700, 175, 0}, {350, 350, 0}, {525, 350, 0}, {700, 350, 0},{350, 525, 0}, {525, 525, 0}, {700, 525, 0}, {350, 700, 0}, {525, 700, 0}, {700, 700, 0},{350, 175, -175}, {525, 175, -175}, {700, 175, -175}, {350, 350, -175}, {525, 350, -175}, {700, 350, -175},{350, 525, -175}, {525, 525, -175}, {700, 525, -175}, {350, 700, -175}, {525, 700, -175}, {700, 700, -175} };
    
    //int[][][] drawBoxes = new int {{350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700}, {175,175,175,175,350,350,350,350,525,525,525,525,700,700,700,700,175,175,175,175,350,350,350,350,525,525,525,525,700,700,700,700,175,175,175,175,350,350,350,350,525,525,525,525,700,700,700,700,175,175,175,175,350,350,350,350,525,525,525,525,700,700,700,700},{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-175,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-350,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525,-525}
    //};
    private boolean needFill = false;
    private boolean has2048 = false;
    
    //ArrayList<Block> blockList = new ArrayList<>(); ////////
    
    public static void main(String[] args){
    PApplet.main("Jane2048");
    }
    public void settings(){
        size(860,860,P3D);
        //cam = new PeasyCam(this,400);
    }
    public void setup(){
        
    }
    public void draw(){
        background(255);
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
        keyPressed();
        
      //  for (Block block : blockList) {
        //    block.display();
        //}
      /*  for(int i=0;i<64;i++){
            stroke(0);
            pushMatrix();
            translate(drawBoxes[i][i][i]);
            box(160);
            popMatrix();
        }*/
        
        //Add keypress stuff here
        
    }
     public void keyPressed(){
        int randoX = (int) (Math.random() * 4);
        int randoY = (int) (Math.random() * 4);
        int randoZ = (int) (Math.random() * 4);
        Block addingBlock = new Block(width/4 + randoX*80, height/4 + randoY*80, randoZ*80, this);
        
        //blockList.add(addingBlock); ///////
     }
}

    
    
