import processing.core.*;

public class Face {
    public Face(PApplet p, float y, int velocity){
        this.y=y;
        this.velocity=velocity;
        this.p=p;
    }
    public void display(){
    p.noFill();
    p.stroke (0);
    p.rect (50,50,400,400); //face
    p.rect (100,100,100,100); //left eye
    p.rect (400,100,-100,100); //right eye
    p.fill (0);
    p.rect (100,100,100,y); //left blink
    p.rect (400,100,-100,y); //left blink
    p.arc (200, 325, 250, 200, 0, p.PI+p.QUARTER_PI, p.CHORD); //smile
    y+=velocity;
    if (y == 100)
        velocity = -1;
    if (y<0)
        velocity = 1;  
    }
    private float y = 0; 
    private int velocity = 1;
    private PApplet p;
}