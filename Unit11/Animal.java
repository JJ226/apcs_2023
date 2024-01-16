public class Animal{
    public Animal(String name, int legCount, boolean isFurry){
    this.name=name;
    this.legCount=legCount;
    this.isFurry=isFurry;
    }
    
    public String getName(){
        return name;
    }
    
    public int getLegCount(){
        return legCount;
    }
    
    public boolean getIsFurry(){
        return isFurry;
    }
    
    protected String name;
    protected int legCount;
    protected boolean isFurry;
}