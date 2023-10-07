//A utility class for printing out information for a particular vehicle
public class VehicleUtility {
    public static void printVehicleInformation(Vehicle vehicle, String vehicleType) {
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Travel Distance: " + vehicle.getDistance() + "km");
        System.out.println("Travel Time: " + vehicle.getTime() + " hours");
        System.out.println("Current Fuel Level: " + vehicle.getFuelLevel() + "L");
        System.out.println("Fuel Cost: $" + vehicle.getFuelCost());
        System.out.println();
    }
}

