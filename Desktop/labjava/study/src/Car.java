public class Car extends Vehicle implements Movable{

    public Car(String model, int speed) {
        super(model, speed);
    }

    @Override
    public void move() {
        System.out.println(getModel() +" is moving ");
    }

    @Override
    public void stop() {
        System.out.println(getModel() +" was stopped");
    }
    public void turnOnAC(){
        System.out.println("Turning on AC");
    }
}
