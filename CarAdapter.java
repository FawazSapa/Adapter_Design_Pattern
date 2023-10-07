//Adapter for car legacy code

public class CarAdapter implements Vehicle {
    public double amount;

    private Car car;//reference to the adaptee-legacy code
    public CarAdapter(Car car){//setting the legacy code reference through constructor
        this.car=car;
    }
    public void Travel(double distance){
        car.carTravel(distance);//calling the legacy code
    }
    public void Addfuel(double amount){
        car.carAddFuel(amount);//calling the legacy code
    }

    public double getDistance(){
        return car.getCarDistance();//calling the legacy code
    }
    public double getTime(){
        return car.getCarTime();//calling the legacy code
    }
    public double getFuelLevel(){
       return car.getCarFuelLevel();//calling the legacy code
    }
    public double getFuelCost(){
        return car.getCarFuelCost();//calling the legacy code
    }


}
