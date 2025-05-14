public class Instru extends Instrumant implements Playable{

    public Instru(String name, String owner, int time) {
        super(name, owner, time);
    }


    @Override
    public void play() {
        System.out.println( "Starting playing ");
    }

    @Override
    public void printInstrument() {
        System.out.println("Somebody wanted to barrow" + name);
    }

    @Override
    public void printOwner() {
        System.out.println(owner + "barrowed the instrumant" + name);
    }

    @Override
    public void printTime() {
        System.out.println("İt is not here " +time);
    }

    @Override
    public String toString() {
        return "Instru{" +
                "name='" + name + '\'' +
                ", owner='" + owner + '\'' +
                ", time=" + time +
                '}';
    }
}
