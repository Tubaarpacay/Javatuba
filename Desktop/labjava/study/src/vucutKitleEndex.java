import java.util.Scanner;

public class vucutKitleEndex {
    public static void main(String[] args) {
        Scanner kilo=new Scanner(System.in);
        Scanner boy=new Scanner(System.in);
        double inputKilo=kilo.nextInt();
        double inputBoy=boy.nextInt();
        double realBoy= inputBoy/100;
        double kareBoy=Math.pow(realBoy,2);
        double endex=inputKilo/kareBoy;
        if(endex<15){
            System.out.println("çok ciddi derecede düşük kilo:" + endex);
        }
        else if(endex>=15 && endex<16){
            System.out.println("ciddi derecede düşük kilo:" + endex);
        }
        else if(endex>=16 && endex<18.5){
            System.out.println("düşük kilo:" +endex);
        } else if (endex>=18.5 && endex<25) {
            System.out.println("normal kilo:" +endex);
        }
        else if(endex>=25 && endex<30){
            System.out.println("fazla kilolu:" +endex);
        } else if (endex>=30 && endex<35) {
            System.out.println("hafif kilolu:" +endex);
        } else if (endex>=35 && endex<40) {
            System.out.println("ciddi obez:" +endex);
        }
        else{
            System.out.println("çok ciddi obez:" +endex);
        }

    }
}
