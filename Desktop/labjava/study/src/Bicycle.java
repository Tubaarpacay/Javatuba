public class Bicycle extends Vehicle implements Movable{

    public Bicycle(String model, int speed) {
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


}
