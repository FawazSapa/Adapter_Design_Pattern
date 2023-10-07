//Adapter class for Airplane legacy code

public class AirplaneAdapter implements Vehicle {
    
    private Airplane airplane;//reference to the adaptee-legacy code
    public AirplaneAdapter(Airplane airplane){
        this.airplane=airplane;//setting the legacy code reference through constructor
    }
    public void Travel(double distance){
        airplane.airplaneTravel(distance);//calling the legacy code
    }
    public void Addfuel(double amount){
        airplane.airplaneAddFuel(amount);//calling the legacy code
    }

    public double getDistance(){
        return airplane.getAirplaneDistance();//calling the legacy code
    }
    public double getTime(){
        return airplane.getAirplaneTime();//calling the legacy code
    }
    public double getFuelLevel(){
       return airplane.getAirplaneFuelLevel();//calling the legacy code
    }
    public double getFuelCost(){
        return airplane.getAirplaneFuelCost();//calling the legacy code
    }


    
}
