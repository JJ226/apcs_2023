import processing.core.*;
import peasy.*;
import java.util.*;

//for x this is the base: 350,175,525,700,350,175,525,700,350,175,525,700,350,175,525,700
public class Jane2048 extends PApplet{
    PeasyCam cam;

    private boolean needFill = false;
    private boolean has2048 = false;
    
    private ArrayList<Block> blockList;
    
    public static void main(String[] args){
    PApplet.main("Jane2048");
    }
    public void settings(){
        fullScreen(P3D);
    }
    public void setup(){
        blockList = new ArrayList<Block>();
        cam = new PeasyCam(this,400);
        addBlock();
        addBlock();
    }
    public void draw(){
        background(255);
        noFill();
        drawAxes();
        //drawBoxes();
        for (int column=0;column<4;column++){
            for (int row=0;row<4;row++){
                for (int zAxis=0;zAxis<4;zAxis++){
                    pushMatrix();
                    translate((0 + row*80), (0 + column*80), (-500 + zAxis*80));
                    stroke(0);
                    box(75);
                    popMatrix(); //215 instead of w/4
                    //540
                }
            }
        }
        
        for (Block x : blockList) {
            x.display();
            //changeNumber();
        }
        combineBlocksToLeft();
        System.out.println(blockList.size());
    }
    public void addBlock(){
        int randoX = (int) (Math.random() * 4);
        int randoY = (int) (Math.random() * 4);
        int randoZ = (int) (Math.random() * 4);
        Block addingBlock = new Block(0 + randoX*80, 0 + randoY*80, -500 + randoZ*80, 2, randoX, randoY, randoZ, this);
        
        blockList.add(addingBlock); 
    }
    
    public void changeNumber(){
       // System.out.println(blockList.get(0).getNumber());
        blockList.get(0).changeNumber();
       // System.out.println(blockList.get(0).getNumber());
    }
    
   // public Block getBlock(int i, int j, int k){
        
    //}
    
    public void combineBlocksToLeft() {
        //ArrayList<Integer> ints = new ArrayList<Integer>();
        ArrayList<Block> b = new ArrayList<Block>();
        for (Block k: blockList){
            if(k.getI() == k.getJ() && k.getI() == 0){
                //ints.add(k.getNumber());
                b.add(k);
            }
        } 
        // Combine blocks for each row
         for (int i = 0; i < b.size(); i++) {
            if (b.getk().get(i) == b.getK().get(i + 1)) {
                b.set(i, b.get(i)*2); // with dot set you are setting the element of the array list when yopu actually want to be setting the location of your block that is in the array list element
                // you might want to great a variable for the specific element and then another for its position which you can then change with just multiplication not dot set.
                b.set(i + 1, 0);
                b.add(0);
                System.out.println("yippee it might be working");
            }
         }
        

        // Shift all non-zero numbers to the left
        for (int i = 1; i < ints.size(); i++) {
            if (b.get(i) != 0) {
                if (b.get(i-1) == 0){
                    b.set(i-1, ints.get(i)); 
                    b.set(i, 0);
                    System.out.println("yay is it working");
                }
            }
        }
    }
    
    /*
    public void combineBlocksToLeft() {
    ArrayList<Integer> ints = new ArrayList<Integer>();
    for (Block block : blockList) {
        if (block.getI() == block.getJ() && block.getI() == 0) {
            ints.add(block.getNumber());
        }
    }
    
    ArrayList<Integer> combinedInts = new ArrayList<Integer>(); // New ArrayList to store combined blocks
    
    // Combine blocks for each row
    boolean combined = false;
    for (int i = 0; i < ints.size() - 1; i++) {
        if (ints.get(i) == ints.get(i + 1)) {
            combinedInts.add(ints.get(i) * 2);
            ints.set(i + 1, 0);
            i++; // Skip the next element since it has been combined
            combined = true;
            System.out.println("Blocks combined!");
        } else {
            combinedInts.add(ints.get(i)); // If no combination, add the current number
        }
    }
    
    // Add the last number if it wasn't combined
    if (!combined && !ints.isEmpty()) {
        combinedInts.add(ints.get(ints.size() - 1));
    }
    
    // Fill in remaining zeros if necessary
    while (combinedInts.size() < 4) {
        combinedInts.add(0);
    }

    // Update blockList with new numbers
    int index = 0;
    for (Block block : blockList) {
        if (block.getI() == block.getJ() && block.getI() == 0) {
            //block.set(combinedInts.get(index));
            index++;
        }
    }
}
*/
    /*
    public static void combineToX(int j, int k, int d) {
        ArrayList<Integer> ints = new ArrayList<>(Integer);
        
        for (int i = 0; i < ints.size() - 1; i++){
        if (keyCode == RIGHT || key == 'd'){
            ArrayList<Integer> = new ArrayList<Integer>();
        // Combine to the left by multiplying adjacent equal numbers by 2
        for (int i = 0; i < BlockList.size() - 1; i++) {
            if (ints.get(i) == ints.get(i + 1)) {
                ints.set(i, ints.get(i)*2);
                ints.set(i + 1, 0);
            }
        }

        // Shift all non-zero numbers to the left
        int currentIndex = 0;
        for (int i = 1; i < ints.size(); i++) {
            if (ints.get(i) != 0) {
                if (ints.get(i-1) == 0){
                    ints.set(i-1, ints.get(i)); 
                    ints.set(i, 0);
                }
            }
        }
        }
        
      //  return ints;
    }
    }
    */
   /* 
    public void combineBlocks(){
        ArrayList<Block> blocksToRemove = new ArrayList<Block>();
        ArrayList<Block> blocksToAdd = new ArrayList<Block>();
        for (int i = blockList.size()-1; i >=0; i--){
            for (int j = blockList.size()-1; j >=0; j--){
                if (dist (blockList.get(i).getX(), blockList.get(i).getY(), blockList.get(i).getZ(), blockList.get(j).getX(), blockList.get(j).getY(), blockList.get(j).getZ()) <0.1){
                  //  blockList.remove(blockList.get(i));
                    blockList.remove(i);
                  //  blockList.remove(blockList.get(j));
                    blockList.remove(j);
                    Block newBlock = new Block(blockList.get(j).getX(), blockList.get(j).getY(), blockList.get(j).getZ(), 4, this);
                    blockList.remove(newBlock);
                  //  blockList.add(newBlock);
                    //then change the color in this?
              //  if dist equal then add new block to the arraylist in same coordinate and delete those two
                    
                }
             }
        }
    }
    */
    //HErERERERE 
    /*
        public void combineBlocks() {
        // Loop through the ArrayList to combine blocks
        for (int i = blockList.size(); i >=1; i--){
            for (int j = blockList.size(); j >=1; j--){
       // for (int i = 0; i < blockList.size() - 1; i++) {
            Block currentBlock = blockList.get(i);
            Block nextBlock = blockList.get(j);

            if (currentBlock.getX() == nextBlock.getX() && currentBlock.getY() == nextBlock.getY()) {
                changeNumber();
                // Merge the two blocks
               // currentBlock.setX(currentBlock.getX());
               // currentBlock.setY(currentBlock.getY());
                // Remove the next block from the ArrayList
                blockList.remove(nextBlock);
                    
                }
            }
        }
    } 
    */
//ENDHERERER

    /*
    // START
        void combineBlocks() {
        // Loop through the ArrayList to combine blocks
        for (int i = 0; i < blockList.size() - 1; i++) {
            Block currentBlock = blockList.get(i);
            Block nextBlock = blockList.get(i + 1);

            if (currentBlock.getX() == nextBlock.getX()) {
                if (currentBlock.getY() == nextBlock.getY()) {
                // Merge the two blocks
                    changeNumber();
                // Remove the next block from the ArrayList
                    blockList.remove(i + 1);
                }
            }
        }
    }

    // END
    */
    
    public void keyPressed(){
            if(keyCode == UP || key == 'w'){
                    for (Block y : blockList){
                        if (y.getY() == 0) {}
                        
                        else {
                            y.setY(80,false);
                    }
                    
                }
            }
        if(keyCode == DOWN || key == 's'){
                    for (Block y : blockList){
                        if (y.getY() == 3*80) {}
                        
                        else {
                            y.setY(80,true);
                    }
                    }
        }
        if(keyCode == LEFT || key == 'a'){
                    for (Block x : blockList){
                        if (x.getX() == 0) {}
                        
                        else {
                            x.setX(80,false);
                    }
                        
                    }
        }
        if(keyCode == RIGHT || key == 'd'){
                    for (Block x : blockList){
                        if (x.getX() == 3*80) {}
                        
                        else {
                            x.setX(80,true);
                    }
                        
                    }
        }
         
         if(key == 'q'){
                    for (Block z : blockList){
                        if (z.getZ() == -500) {}
                        
                        else {
                            z.setZ(80,false);
                    }
                        
                    }
        }
         
         if(key == 'e'){
                    for (Block z : blockList){
                        if (z.getZ() == -500 + 3*80) {}
                        
                        else {
                            z.setZ(80,true);
                    }
                        
                    }
        }
        addBlock();
        
    }
void drawAxes(){
  stroke(255,0,0);
  line(0,0,400,0);
  stroke(0,255,0);
  line(0,0,0,400);
  stroke(0,0,255);
  line(0,0,0,0,0,400);
}
}

    
    
