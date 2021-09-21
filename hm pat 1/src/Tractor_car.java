public class Tractor_car extends Car{


    public Tractor_car(String model, String color, int maxSpeed, Daytime_DL ddl) {
        super(model, color, maxSpeed, ddl);
    }

    @Override
    public void engineOn(){
        System.out.println("Tractor car is started");
    }

}
