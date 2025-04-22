public class KompozisyonOrnegi {
    public static void main(String[] args) {
         Araba myAraba=new Araba();
         myAraba.hareketeGec();
         myAraba.dur();
    }
}
class Motor{
    private String isim;
    private int beygirGucu;

    public Motor(){
        isim="Honda";
        beygirGucu=135;
        System.out.println(isim +" isimli ve " +beygirGucu+" beygirgücü motor oluşturuldu");
    }
    public void calistir(){
        System.out.println("Motor çalıştı");
    }
    public void durdur(){
        System.out.println("Motor durdu");
    }
}
class Araba{
    private Motor arabaMotoru;
    private String renk;
    private String marka;
    private int uretimYili;
    public  Araba(){
        arabaMotoru=new Motor();
        renk="kırmızı";
        marka="Toyota";
        uretimYili=2019;
        System.out.println(renk+" renkli "+uretimYili+" model "+marka+" marka araba oluşturuldu");
    }
    public void hareketeGec(){
        System.out.println("Araba harekte geçiyor");
    }
    public void dur(){
        System.out.println("Araba duruyor");
    }
}