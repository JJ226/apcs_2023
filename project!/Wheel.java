import processing.core.*;

public class Wheel {
    public Wheel(PApplet p, float xIn, float yIn, float widthIn, float heightIn){
        this.y=yIn;
        this.x=xIn;
        this.width=widthIn;
        this.height=heightIn;
        this.p=p;
    }
    public void display(){
        p.noStroke();
        p.fill(110);
        p.ellipse(x,y,width, height);
        
        if (ellipseDist(p.mouseX, p.mouseY, 100, 100) < 1)
            p.fill(0, 0, 255);
        else
            p.fill(255, 0, 0);
        p.ellipse(100, 100, 100, 50);
    }
    public void update(){
     
    }
  //  public float ellipseDist(){ //float xPoint, float yPoint, float h, float k
    //    return ((((mouseX-xIn)*(mouseX-h))/(xSize1*xSize1)) + (((yPoint-k)*(yPoint-k))/(ySize1*ySize1)));
    //}
    public void mouseDragged(){
        if (p.mouseX > p.pmouseX){
            x++;
        } 
        else if (p.mouseX < p.pmouseX){
            x--;
        }
        else if (p.mouseY < p.pmouseY){
            y++;
        }
        else if (p.mouseY > p.pmouseY){
            y--;
        }
    }
    
    
   // private float ellipseDistx1 = ellipseDist(x1)
    
    private PApplet p;
}