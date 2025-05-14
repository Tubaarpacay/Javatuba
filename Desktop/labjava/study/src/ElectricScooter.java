public class ElectricScooter extends  Vehicle implements Movable{

    public ElectricScooter(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void move() {
        System.out.println(getModel() + " is moving");
    }

    @Override
    public void stop() {
        System.out.println(getModel() + " was stopped");
    }

    public void checkBattery(){
        System.out.println("Battery %80");
    }
}
