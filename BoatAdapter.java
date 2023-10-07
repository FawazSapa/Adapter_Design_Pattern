//Adapter for the Boat legacy code

public class BoatAdapter implements Vehicle {
    private Boat boat;//reference to the legacy code
    public  BoatAdapter(Boat boat){//setting the legacy code reference through constructor
        this.boat=boat;


    }
    public void Travel(double distance){
        boat.boatTravel( distance);//calling the legacy code
    }
    public void Addfuel(double amount){
        boat.boatAddFuel(amount);//calling the legacy code
    }

    public double getDistance(){
        return boat.getBoatDistance();//calling the legacy code
    }
    public double getTime(){
        return boat.getBoatTime();//calling the legacy code
    }
    public double getFuelLevel(){
       return boat.getBoatFuelLevel();//calling the legacy code
    }
    public double getFuelCost(){
        return boat.getBoatFuelCost();//calling the legacy code
    }

}
