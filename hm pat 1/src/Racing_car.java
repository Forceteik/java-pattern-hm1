public class Racing_car extends Car{


    public Racing_car(String model, String color, int maxSpeed, Daytime_DL ddl) {
        super(model, color, maxSpeed, ddl);
    }

    @Override
    public void engineOn(){
        System.out.println("Racing car is started");
    }


}
