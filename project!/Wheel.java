import processing.core.*;

public class Wheel {
    public Wheel(PApplet p, float x, float y){
        this.y=y;
        this.x=x;
        this.p=p;
    }
    public void starting(){
        p.ellipse(200,400,x, 10);
        p.ellipse(200,390,x, 20);
        p.ellipse(200,380,x, 30);
        p.ellipse(200,370,x, 40);
        p.ellipse(200,360,x, 50);
    }
    public void update(){
     
    }
    public void mouseDragged(){
        if (p.mouseX>=200-x/2 && p.mouseX<=200+x/2 && p.mouseY>=400 && p.mouseY<=410 && p.mouseY++)
            x--;
        else if (p.mouseX>=200-x/2 && p.mouseX<=200+x/2 && p.mouseY>=400 && p.mouseY<=410 && p.mouseX++)
            x++;
    }
    private float y = 50; 
    private float x = 100;
    private PApplet p;
}