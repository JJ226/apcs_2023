import processing.core.*;

public class Wheel {
    public Wheel(PApplet p, float x, float y){
        this.ySize1=y;
        this.xSize1=x;
        this.p=p;
    }
    public void starting(){
        p.noStroke();
        p.fill(110);
        p.ellipse(x1,y1,xSize1, ySize1);
        p.ellipse(x2,y2,xSize2, ySize2);
        p.ellipse(x3,y3,xSize3, ySize3);
        p.ellipse(x4,y4,xSize4, ySize4);
        p.ellipse(x5,y5,xSize5, ySize5);
    }
    public void update(){
     
    }
    public float ellipseDist(float xPoint, float yPoint, float h, float k){
        return ((((xPoint-h)*(xPoint-h))/(xSize1*xSize1)) + (((yPoint-k)*(yPoint-k))/(ySize1*ySize1)));
    }
    public void mouseDragged(){
        if (p.mouseX > p.pmouseX){
             if (ellipseDist(p.mouseX,p.mouseY,x1,y1)<2)
                 xSize1++;
             else if (ellipseDist(p.mouseX,p.mouseY,x2,y2)<2)
                 xSize2++;
             else if (ellipseDist(p.mouseX,p.mouseY,x3,y3)<1)
                 xSize3++;
             else if (ellipseDist(p.mouseX,p.mouseY,x4,y4)<1)
                 xSize4++;
             else if (ellipseDist(p.mouseX,p.mouseY,x5,y5)<1)
                 xSize5++;
        } 
        else if (p.mouseX < p.pmouseX){
      //      xSize--;
        }
        else if (p.mouseY < p.pmouseY){
         //   ySize1++;
            ySize2++;
            ySize3++;
            ySize4++;
            ySize5++;
        }
        else if (p.mouseY > p.pmouseY){
          //  ySize1--;
            ySize2--;
            ySize3--;
            ySize4--;
            ySize5--;
        }
    }
        
   // private float ySize = 100; 
  //  private float xSize = 50;
    //sizes
    private float xSize1 = 100;
    private float ySize1 = 50;
    private float xSize2 = 100;
    private float ySize2 = 50;
    private float xSize3 = 100;
    private float ySize3 = 50;
    private float xSize4 = 100;
    private float ySize4 = 50;
    private float xSize5 = 100;
    private float ySize5 = 50;
    
    //locations
    private float x1 = 200;
    private float y1 = 400;
    private float x2 = 200;
    private float y2 = 390;
    private float x3 = 200;
    private float y3 = 380;
    private float x4 = 200;
    private float y4 = 370;
    private float x5 = 200;
    private float y5 = 360;
    
    
   // private float ellipseDistx1 = ellipseDist(x1)
    
    private PApplet p;
}