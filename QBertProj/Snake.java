import processing.core.*;

public class Snake {
    private int x;
    private int y;
    private int count;
    private PImage s1;
    private int rando;
    //private PImage s2;
    //private PImage s3;
    PApplet p;
  
Snake(int x, int y, PApplet p) {
    this.x = x;
    this.y = y;
    this.p=p;
    s1 = p.loadImage("SNAKE.png");
    //s2 = p.loadImage();
   // s3 = p.loadImage();
    }
    
/*public void setup(){
   yImage = p.loadImage("YELLOW.png"); 
}*/
    
public int getX(){ return x; }
public int getY(){ return y; }
    
public void movement() {
    p.image(s1,x,y);
    count+=1;
    rando = (int)(Math.random()*4);
    
    if (count%40==0){
        if (rando <= 1){
            if (x + 60 < p.width/2+100 && y + 100 < p.height/2+100){ //x + 60 < p.width/2+365 && y + 100 < p.height/2+365
                x+=60;
                y+=100;
            }
    }
    else if (rando <= 2 && rando >= 1){
        if (x + 60 < p.width/2+100 && y - 100 < p.height/2-100){
        x+=60;
        y-=100;
        }
    }
    else if (rando <= 3 && rando >= 2){
        if (x - 60 < p.width/2-100 && y - 100 < p.height/2-100){
        x-=60;
        y-=100;
        }
    }
        
    else if (rando <= 4 && rando >= 3){
        if (x - 60 < p.width/2+100 && y + 100 < p.height/2+100){
        x-=60;
        y+=100;
        }
    }   
    }
    
        
  }
}

