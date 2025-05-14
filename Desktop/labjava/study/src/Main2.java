public class Main2 {
    public static void main(String[] args) {
        Vehicle[] fleet={
                new Car("Toyata",200),
                new Bicycle("Scoda",30),
                new ElectricScooter("Wolkvagen",80)
        };
        for(Vehicle v : fleet){
            v.printStatus();
            v.move();
            v.stop();

            if ( v instanceof Car){
                ((Car)v).turnOnAC();
            } else if (v instanceof  ElectricScooter) {
                ((ElectricScooter)v).checkBattery();
            }
            System.out.println("-------------");
        }
    }
}
