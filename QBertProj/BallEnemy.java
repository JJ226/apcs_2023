import processing.core.*;

public class BallEnemy{
    private int x;
    private int y;
    private int count;
    private PImage b1;
    private int rando;
    //private PImage s2;
    //private PImage s3;
    PApplet p;
    
    public BallEnemy(int x, int y, PApplet p){
        this.x = x;
        this.y = y;
        this.p=p;
        b1 = p.loadImage("Ball.png");
    }
    public int getX(){ return x; }
    public int getY(){ return y; }
    
    public void movement(){
        p.image(b1,x,y);
        count+=1;
        rando = (int)(Math.random()*4);
        if (count%40==0){
        if (rando <= 1){
            if (x + 60 < p.width/2+365 && y + 100 < p.height/2+365){
                x+=60;
                y+=100;
            }
    }
    else if (rando <= 2 && rando >= 1){
        if (x + 60 < p.width/2+365 && y - 100 < p.height/2-365){
        x+=60;
        y-=100;
        }
    }
    else if (rando <= 3 && rando >= 2){
        if (x - 60 < p.width/2-365 && y - 100 < p.height/2-365){
        x-=60;
        y-=100;
        }
    }
        
    else if (rando <= 4 && rando >= 3){
        if (x - 60 < p.width/2+365 && y + 100 < p.height/2+365){
        x-=60;
        y+=100;
        }
    }   
    }
}
}