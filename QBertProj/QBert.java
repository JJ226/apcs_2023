
import processing.core.*;
import java.util.*;
//import processing.sound.*;
//import gifAnimation.*;

public class QBert extends PApplet{
    
    private int gameState = 0;
    
    private PImage bertL;
    private PImage bertR;
    private PImage bg;
    private PImage winScreen;
    private PImage yellowBlock;
    private int bertX;
    private int bertY;
    private int counting;
    private boolean r = false;
    private boolean yellowPlaced = false;
    private boolean collided = false;
    static ArrayList<YellowBlock> yellowBlocks = new ArrayList<YellowBlock>();
    private Snake s1;
    private BallEnemy b1; 
   // SoundFile qJump;
    //private Gif start;
    
    public static void main(String[] args){
        PApplet.main("QBert");
    }
    
    public void settings(){
        fullScreen();
    }
    
    public void setup(){
        bg = loadImage ("blocks.png");
        winScreen = loadImage ("win.jpg");
        bg.resize(1866,1050);//-266,-150
        imageMode(CENTER);
        bertX = width/2;
        bertY = 45;
        s1 = new Snake(width/2-60,140,this);
        b1 = new BallEnemy(width/2-35,85,this);
        
        bertL = loadImage ("q.png");
        bertR = loadImage ("qR.png");
        yellowBlock = loadImage("YELLOW.png");
        bertL.resize(101,99); //504,495
        bertR.resize(333,188); //666,375
        imageMode(CENTER);
        image(bertL, width/2, 45); //570
        //qJump = new SoundFile(this, "Jump.mp3");
      //  start = new Gif(this, "Start.gif");

    }
    
    public void draw(){
        if (gameState == 0)
            startScreen();
        else if (gameState == 1)
            duringGame();
        else if (gameState == 2)
            endScreenWin();
    }
    
    public void duringGame(){
        background (255);
        imageMode(CENTER);
        image(bg, width/2, height/2);
        for (YellowBlock block : yellowBlocks)
            block.display();
        if (r)
            image(bertR, bertX, bertY);
        else
            image(bertL, bertX, bertY);
        
        textSize(100);
        
        if (bertY<=0){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 45 && (bertX >width/2+60|| bertX < width/2-60)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 145 && (bertX >width/2+105|| bertX < width/2-105)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 245 && (bertX >width/2+150|| bertX < width/2-150)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 345 && (bertX >width/2+195|| bertX < width/2-195)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 445 && (bertX >width/2+240|| bertX < width/2-240)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 545 && (bertX >width/2+300|| bertX < width/2-300)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY == 645 && (bertX >width/2+365|| bertX < width/2-365)){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        else if (bertY > 645){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        collision();
        if (collided == true){
            bertY+= width;
            text("You Lost...",width/2-200,height/2);
        }
        //fill(0);
        text("bert X: " + bertX + " bert Y: " + bertY + " snake X: " + s1.getX() + " snake Y: " + s1.getY() + " ball X: " + b1.getX() + " ball Y: " + b1.getY(),50,50);
        s1.movement();
        b1.movement();
        /*
        counting+=1;
        if (counting%300==0){
            s2.movement();
            break
        }
        
        */
    }
    
    private int countB = 0;
    public void keyPressed(){
        if (keyCode==LEFT){
            bertX -= 60;
            bertY -= 100;
            r = false;
          //  qJump.play();
            YellowBlock newYellow = new YellowBlock(bertX-12,bertY+81,this);
           /* for (YellowBlock currentYellow : yellowBlocks){
                if (bertX-12!=currentYellow.getX() && bertY+82 != currentYellow.getY())
                    countB+=1;
            }
            if (countB>=yellowBlocks.size())
                //System.out.println(countB);*/
                yellowBlocks.add(newYellow);
            
        } else if (keyCode == RIGHT) {
            bertX += 60;
            bertY +=100;
            r = true;
      //      qJump.play();
            YellowBlock newYellow = new YellowBlock(bertX-12,bertY+81,this);
           /*for (YellowBlock currentYellow : yellowBlocks){
                if (bertX-12!=currentYellow.getX() && bertY+82 != currentYellow.getY())
                    countB+=1;
            }
            if (countB>=yellowBlocks.size())
            //System.out.println(countB);*/
                yellowBlocks.add(newYellow);
        } else if (keyCode == UP) {
            bertY -= 100;
            bertX +=60;
            r = true;
     //       qJump.play();
            YellowBlock newYellow = new YellowBlock(bertX-12,bertY+81,this);
           /* for (YellowBlock currentYellow : yellowBlocks){
                if (bertX-12!=currentYellow.getX() && bertY+82 != currentYellow.getY())
                    countB+=1;
            }
            if (countB>=yellowBlocks.size())
            //System.out.println(countB);*/
                yellowBlocks.add(newYellow);
        } else if (keyCode == DOWN) {
            bertY += 100;
            bertX -= 60;
            r = false;
       //     qJump.play();
            YellowBlock newYellow = new YellowBlock(bertX-12,bertY+82,this);
           /* for (YellowBlock currentYellow : yellowBlocks){
                if (bertX-12!=currentYellow.getX() && bertY+82 != currentYellow.getY())
                    countB+=1;
            }
            if (countB>=yellowBlocks.size())*/
            //System.out.println(countB);
                yellowBlocks.add(newYellow);
        }
       // System.out.println(countB);
        
        if (keyCode == ENTER){
            gameState = 2;
        }
        
    }
    
    public void mousePressed(){
        gameState = 1;
    }
    
    public void endScreenWin(){
        background (255);
        image(winScreen, width/2, height/2 - 200);
    }
    
    public void startScreen(){
        background(0);
    //    image(start, width/2, height/2 - 200);
     //   start.play();
    }
    
    public void collision(){
    if ((dist(bertX, bertY, s1.getX(), s1.getY()) <40))
        collided = true;
    else if ((dist(bertX, bertY, b1.getX(), b1.getY()) <75 && dist(bertX, bertY, b1.getX(), b1.getY()) >64))
        collided = true;
    else 
        collided = false;
}
}