import java.util.Scanner;

public class Arrayler {
    public static void main(String[] args) {

        int sayilar[]=new int[10];
        /*
        int[] sayilar2=new int[10];
        int []sayilar3=new int[10];
        int[] sayilar4={1,2,3,4,5};

        sayilar[0]=1;
        sayilar[1]=2;
        sayilar[2]=3;
        sayilar[3]=4;
        sayilar[5]=5;
        */
        for(int index = 0; index <sayilar.length ; index++) {
             sayilar[index]=index*index;
             //sayilar[index]=(int)Math.pow(index,2);
        }
        for (int index = 0; index <sayilar.length ; index++) {
            System.out.println("Eleman :" +sayilar[index]);
        }

        String[] aylar={"Ocak","Şubat","Mart,Nisan","Haziran","Temmuz","Ağustos","Eylül","Ekim","Kasım","Aralık"};
        Scanner tara=new Scanner(System.in);
        System.out.println("Ay değerini girin");
        int ay= tara.nextInt();
        System.out.println("Seçtiğiniz ay :" +aylar[ay-1]);

        System.out.println("Kaç tane sayı girmek istiyorsun ?");
        int sayi= tara.nextInt();
        int kullaniciSayilari[]=new int[sayi];
        double ortalama=0;
        for (int i = 0; i <sayi ; i++) {
            System.out.println("Sayi giriniz :");
            kullaniciSayilari[i]= tara.nextInt();
            ortalama=ortalama+kullaniciSayilari[i];
        }
        System.out.println("Girdiğiniz sayıların ortalaması :" +(ortalama/kullaniciSayilari.length));

        int[] numbers={1,2,3,4,5,6};
        for(int i=0;i<numbers.length;i++){
            System.out.println("Eleman:" +numbers[i]);
        }
        for(int nowNumber:numbers)
            System.out.println("for each eleman:" +nowNumber);
        String isimler[]={"emre","hasan","ali"};
        diziYazdir(isimler);

    }
    public static void diziYazdir(String dizi[]){
        for(String s:dizi)
            System.out.println("for each isim:" +s);
    }
}
