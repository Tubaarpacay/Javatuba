public class KalitimOrnek {
    public static void main(String[] args) {
        Dikdortgen d1=new Dikdortgen(10,20);
        d1.OzellikleriYazdir();
        System.out.println(d1);
        GeometrikSekil gs1=new GeometrikSekil(5,10);
        System.out.println(gs1);
        Kare k1=new Kare(10);
        k1.OzellikleriYazdir();
        k1.alanHesapla();
        k1.cevreHesapla();
    }
}
class GeometrikSekil{
    private int en;
    private int boy;

    public GeometrikSekil(int en, int boy) {
        this.en = en;
        this.boy = boy;
    }

    public GeometrikSekil(int en) {
        this.en = en;
    }

    public GeometrikSekil() {
    }

    public int getEn() {
        return en;
    }

    public void setEn(int en) {
        this.en = en;
    }

    public int getBoy() {
        return boy;
    }

    public void setBoy(int boy) {
        this.boy = boy;
    }
    public void alanHesapla(){
        System.out.println("Alan : " +(getEn()*getBoy()));
    }
    public void cevreHesapla(){
        System.out.println("Çevre : " +(en+boy)*2);
    }

    @Override
    public String toString() {
        return "GeometrikSekil{" +
                "en=" + en +
                ", boy=" + boy +
                '}';
    }
}
class Dikdortgen extends GeometrikSekil{
    public Dikdortgen(int en,int boy){
        setEn(en);
        setBoy(boy);
    }
    public Dikdortgen(int en){
        setEn(en);
    }
   public void OzellikleriYazdir(){
       System.out.println("Geometrik şeklin eni : " +getEn() +" boyu : " +getBoy());
       alanHesapla();
       cevreHesapla();
       System.out.println(" Geometrik şeklin alanı : " +(getBoy()*getEn()) + " çevresi : " +(getBoy()+getEn()*2));
   }

    @Override
    public String toString() {
        return "Dikdortgenin eni :" +getEn()
                +" boyu :" +getBoy();
    }
}
class Kare extends Dikdortgen{
    /*
    public Kare(int en, int boy) {
        super(en, boy);
    }
    */
    public Kare(int en) {
        super(en);
        setBoy(en);

    }
}