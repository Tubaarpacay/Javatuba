import java.util.Arrays;

public class ArrayKopyalama {


    public static void main(String[] args) {
        int[] anadizi={1,7,9,10};
        int[] kopyaDizi=new int[anadizi.length];

        for (int index=0;index<anadizi.length;index++){
            kopyaDizi[index]=anadizi[index];
        }
        for(int sayi: kopyaDizi){
            System.out.println("kopya dizi elemanları :" +sayi);
        }


        int[][] sayilar={{1,2,3},{3,4,5},{6,7,8}};
        for (int satir = 0; satir <sayilar.length ; satir++) {
            for (int sutun = 0; sutun <sayilar[satir].length ; sutun++) {
                System.out.println(satir + ". satırın" + sutun + ".sütunundaki değer :" +sayilar[satir][sutun]);
            }
        }
        System.out.println("*********************************");

        int[][] borclar={{0,100,200},{350,0,250},{150,500,0}};
        String[] isimler={"emre","hasan","ali"} ;
        for (int satir = 0; satir <borclar.length ; satir++) {
            for (int sutun = 0; sutun <borclar[satir].length ; sutun++)
                if(satir !=sutun) {
                    int alacak = borclar[satir][sutun] - borclar[sutun][satir];
                    if (alacak < 0) {
                        System.out.println(isimler[satir] + " 'nin " + isimler[sutun] + " 'den alacağı :" + (-alacak));
                    }

            }
        }
        int numbers[]={1,9,5,2,7,9,60,120,55,-9};
        diziYazdir(numbers);
        diziYerDegistir(numbers);
        System.out.println("yer değiştirme metodundan sonra dizi");
        diziYazdir(numbers);
        System.out.println("sıralama metodundan sonra dizi");
        selectionSort(numbers);
        diziYazdir(numbers);
        System.out.println("sıralama sonrası dizi");
        Arrays.sort(numbers);
        diziYazdir(numbers);
        int a=Arrays.binarySearch(numbers,8);
        System.out.println("sonuç :" +a);
        int sonuc=binarySearch(numbers,54);

        if(sonuc<0){
            System.out.println("Eleman bu dizide yoktur");
        }else{
            System.out.println("Sonuç :" +sonuc);
        }
    }
    public static void diziYerDegistir(int[] dizi){
        for(int i= dizi.length-1;i>0;i--){
            int rastgele=(int)(Math.random()*(i+1));
            int gecici=dizi[i];
            dizi[i]=dizi[rastgele];
            dizi[rastgele]=gecici;
        }
    }
    public static void selectionSort(int[] dizi){
        for (int i =0;i<dizi.length-1;i++){

            //en küçük elemanın ve indexinin bulunması.
            int nowMinEleman=dizi[i];
            int nowMinIndex=i;

            for(int j=i+1;j< dizi.length;j++){
                if(nowMinEleman>dizi[j]){
                    nowMinEleman=dizi[j];
                    nowMinIndex=j;
                }
            }
            if(nowMinIndex!=i){
                dizi[nowMinIndex]=dizi[i];
                dizi[i]=nowMinEleman;
            }
        }
    }
    public static int  binarySearch(int [] dizi,int aranacakEleman) {
        int enDusukIndex = 0;
        int enBuyukIndex = dizi.length - 1;

        while (enBuyukIndex >= enDusukIndex) {
            int ortaIndex = (enDusukIndex + enBuyukIndex) / 2;
            if (aranacakEleman < dizi[ortaIndex]) {
                enBuyukIndex = ortaIndex - 1;
            } else if (aranacakEleman == dizi[ortaIndex]) {
                return ortaIndex;
            } else {
                enDusukIndex = ortaIndex + 1;
            }
        }
        return -enDusukIndex -1;
    }
        public static void diziYazdir ( int[] dizi){
            for (int i : dizi) {
                System.out.println("Eleman : " + i);
            }
        }
    }
