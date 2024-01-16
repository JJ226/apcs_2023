public class Motorcycle implements Vehicle{
    public Motorcycle (String name, int wheelCount, boolean isHumanPowered){
        this.name=name;
        this.wheelCount=wheelCount;
        this.isHumanPowered=isHumanPowered;
    }
    public String getName() {
        return name;
    }

    public int getWheelCount() {
        return wheelCount;
    }

    public boolean isHumanPowered() {
        return isHumanPowered;
    }

    private String name;
    private int wheelCount;
    private boolean isHumanPowered;
}