public class InMain {
    public static void main(String[] args) {
        Instrumant[] instrumants= {
                new Instru("Violet","tuba",12),
                new Instru("guitar","irem",24)
        } ;
        for(Instrumant i: instrumants){
            i.printInstrument();
            i.printOwner();
            i.printTime();
        }
        }
    }

