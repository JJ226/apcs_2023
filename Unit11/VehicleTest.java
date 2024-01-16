import java.util.*;


public class VehicleTest
{
    public static void main(String[] args)
    {
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Car car1 = new Car("Car",4,false);
        Motorcycle motorcycle1 = new Motorcycle("Motorcycle",2,false);
        Bicycle bicycle1 = new Bicycle("Bicycle",2,true);
        Unicycle unicycle1 = new Unicycle("Unicycle",1,true);
        
        vehicles.add(car1);
        vehicles.add(motorcycle1);
        vehicles.add(bicycle1);
        vehicles.add(unicycle1);

        for (Vehicle v : vehicles)
        {
            System.out.println(v.getName());
            System.out.println(v.getWheelCount());
            System.out.println(v.isHumanPowered());
            System.out.println();
        }
    }
}

