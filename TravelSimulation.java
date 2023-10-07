import java.util.Scanner;
import java.io.*;
//client code

class TravelSimulation {
    public static void main(String[] args) {
        Car Car=new Car();//creating the legacy code-car
        Airplane Airplane =new Airplane();//creating the legacy code-airplane
        Boat Boat=new Boat();//creating the legacy code-boat
        Vehicle car = new CarAdapter(Car);//creating adapter for car
        Vehicle boat= new BoatAdapter(Boat);//creating adapter for boat
        Vehicle airplane= new AirplaneAdapter(Airplane);//creating adapter for airplane
        // the boat travels 100km and information about the boat is printed
        boat.Travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        // the car travels 1000km and information about the car is printed
        car.Travel(1000.0);
       VehicleUtility.printVehicleInformation(car, "Car");

        // the airplane travels 10000km and information about the airplane is printed
        airplane.Travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        // Add fuel to each
        System.out.println();
        System.out.println("Adding fuel...");
        System.out.println();

        boat.Addfuel(120);
        car.Addfuel(40);
        airplane.Addfuel(50000);

        // Travel again
        // Boat
        boat.Travel(100.0);
        VehicleUtility.printVehicleInformation(boat, "Boat");

        // Car
        car.Travel(1000.0);
       VehicleUtility. printVehicleInformation(car, "Car");

        // Airplane
        airplane.Travel(10000.0);
        VehicleUtility.printVehicleInformation(airplane, "Airplane");

        new java.util.Scanner(System.in).nextLine();
    }
}
