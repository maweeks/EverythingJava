public class Task029Vehicle {
    private String make;
    private String model;
    private int wheels;
    private int bhp;

    public Task029Vehicle(String make, String model, int wheels, int bhp) {
        this.make = make;
        this.model = model;
        this.wheels = wheels;
        this.bhp = bhp;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public int getBhp() {
        return bhp;
    }

    public void setBhp(int bhp) {
        this.bhp = bhp;
    }
}
