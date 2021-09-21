public class Passenger_car extends Car{


    public Passenger_car(String model, String color, int maxSpeed, Daytime_DL ddl) {
        super(model, color, maxSpeed, ddl);
    }

    @Override
    public void engineOn(){
        System.out.println("Passenger car is started");
    }

}
