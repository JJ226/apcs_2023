import processing.core.*;

public class blink extends PApplet{
public void settings(){
    size (500,500);
}
public void setup(){
    
}
public void draw(){
    background (255);
    noFill();
    stroke (0);
    rect (50,50,400,400); //face
    rect (100,100,100,100); //left eye
    rect (400,100,-100,100); //right eye
    fill (0);
    rect (100,100,100,y); //left blink
    rect (400,100,-100,y); //left blink
    arc (200, 325, 250, 200, 0, PI+QUARTER_PI, CHORD); //smile
    y+=velocity;
    if (y == 100)
        velocity = -1;
    if (y<0)
        velocity = 1;
}
    private float y=0;
    private int velocity = 1;
public static void main(String[] args){
    PApplet.main("blink");
}

}
