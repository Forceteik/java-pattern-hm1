public abstract class Car implements Daytime_DL {

    public String model;
    public String color;
    public int maxSpeed;
    public Daytime_DL ddl;

    @Override
    public void Light() {

    }

    public Car(String model, String color, int maxSpeed, Daytime_DL ddl) {
        this.model=model;
        this.color=color;
        this.maxSpeed=maxSpeed;
        this.ddl=ddl;
    }

    public void engineOn() {

    }

    public void engineOff() {

    }
}
