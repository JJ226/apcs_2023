public class Student{
    private String name;
    private int favNum;
    public Student (String name, int favNum){
        this.name=name;
        this.favNum=favNum;
    }
    public String getName(){
        return name;
    }
    
    public int getFavNum(){
        return favNum;
    }
}