public class Truck_car extends Car{


    public Truck_car(String model, String color, int maxSpeed, Daytime_DL ddl) {
        super(model, color, maxSpeed, ddl);
    }

    @Override
    public void engineOn(){
        System.out.println("Truck car is started");
    }

}
