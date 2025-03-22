import java.util.Scanner;

public class DersCalisma {
    public static void main(String[] args) {


        int number=10;
        while (number<=20){
            System.out.println("Hello number :"+ number);
            number++;
        }
        for (int num=10;num<20;num++){
            System.out.println("Hi num :" +num);
        }
        int s1=0;
        do{
            System.out.println("hello s1:" +s1);
            s1++;
        }while(s1<5);

        for (int i = 0; i <10 ; i++) {
            System.out.println("İ'nin değeri :" +i);
            if(i==4){
                break;
            }
        }
        dıstakiFor: //etiket.
        for (int a = 0; a <5 ; a++) {
            ictekiFor:
            for (int b = 0; b <3 ; b++) {
                System.out.println("a:" + a +" " + "b:" +b);
                if(a==b && b==2){
                    break dıstakiFor;
                }
            }
        }

        for (int i = 0; i <5 ; i++) {
            if(i==2){
                continue;
            }
            System.out.println("i:"+ i);
        }

        for (int i = 0; i < 5; i++) {
            if(i==2){
                return ;
            }
            System.out.println("i:" +i);
        }

        //Scanner ile kullanıcıdan veri alma
        Scanner tara = new Scanner(System.in);
        int  inputValue=tara.nextInt();
        System.out.println("kullanıcının girdiği değer:" + inputValue);
        double doubleValue=tara.nextDouble();
        System.out.println("kullanıcının girdiği değer:" + doubleValue );
        float floatValue=tara.nextFloat();
        System.out.println("kullanıcının girdiği değer:" +floatValue) ;
        String name=tara.next(); //boşluk gelene kadar okur Tuba Arpaçay kısmından sadece tuba'yı okur.
        System.out.println("girilen isim:" + name);
        String isim=tara.nextLine();//bu hepsini okur.
        System.out.println("girilen isim:" +isim);
        char harf=tara.next().charAt(0);
        System.out.println("girilen harf:" +harf);


    }
}
