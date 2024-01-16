import java.util.*;

public class VehicleStats{
    public static int totalWheels(ArrayList<Vehicle> vehicles){
        int count = 0;
        for (Vehicle v : vehicles){
            count += v.getWheelCount();
        }
        return count;
    }
    
    public static ArrayList<Vehicle> isItHumanPowered (ArrayList<Vehicle> vehicles){
        
        ArrayList<Vehicle> hPoweredVehicles = new ArrayList<Vehicle>();
        
        for (Vehicle v : vehicles){
            if (v.isHumanPowered())
                hPoweredVehicles.add(v);
        }
        
        return hPoweredVehicles;
    }
    
    public static void main (String[] args){
        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
        
        Car car1 = new Car("Car",4,false);
        Motorcycle motorcycle1 = new Motorcycle("Motorcycle",2,false);
        Bicycle bicycle1 = new Bicycle("Bicycle",2,true);
        Unicycle unicycle1 = new Unicycle("Unicycle",1,true);
        
        vehicles.add(car1);
        vehicles.add(motorcycle1);
        vehicles.add(bicycle1);
        vehicles.add(unicycle1);
        
        
        System.out.println("Total number of wheels: " + totalWheels(vehicles));
        
        ArrayList<Vehicle> humanPoweredVehicles = isItHumanPowered(vehicles);
        
        System.out.println("Human powered vehicles: ");
        for (Vehicle v:humanPoweredVehicles)
            System.out.println(v.getName());
    }
}