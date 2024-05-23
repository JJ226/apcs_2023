import processing.core.*;

public class YellowBlock {
    private int x;
    private int y;
    private PImage yImage;
    PApplet p;
    
    public int getX(){ return x; }
    public int getY(){ return y; }
    
  
YellowBlock(int x, int y, PApplet p) {
    this.x = x;
    this.y = y;
    this.p=p;
    yImage = p.loadImage("YELLOW.png");
    }
    
/*public void setup(){
   yImage = p.loadImage("YELLOW.png"); 
}*/
    
public void display() {
    p.image(yImage,x,y);
  }
  
}
