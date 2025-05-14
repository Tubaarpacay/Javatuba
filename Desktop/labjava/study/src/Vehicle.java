public abstract class Vehicle implements Movable {
    private String model;
    private int speed;

    public Vehicle(String model, int speed) {
        this.model = model;
        this.speed = speed;
    }

    public String getModel() {
        return model;
    }

    public int getSpeed() {
        return speed;
    }

    void printStatus(){
        System.out.println("Vehicle: " +model + "| Spped: " + speed);
    }
}
