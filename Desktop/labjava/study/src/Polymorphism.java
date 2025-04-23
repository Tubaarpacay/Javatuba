public class Polymorphism {
    public static void main(String[] args) {
        Hayvan h1=new Hayvan();
        Kopek k1=new Kopek("Golden");
        Kedi ke1=new Kedi("sarman");
        adiniSoyle(h1);
        adiniSoyle(ke1);
        adiniSoyle(k1);


    }
    public static void adiniSoyle(Hayvan hayvan){
        hayvan.adiniSoyle();
    }


}

class Hayvan{
    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }
    public void adiniSoyle(){
        System.out.println("Ben hayvan sınıfı nesnesiyim");
    }
}
class Kopek extends Hayvan{
   private String tur;
   public Kopek(String tur){
       setAyakSayisi(4);
       setTur(tur);
   }
    public String getTur() {
        return tur;
    }

    public void setTur(String tur) {
        this.tur = tur;
    }

    @Override
    public void adiniSoyle() {
        super.adiniSoyle();
        System.out.println("Ben bir köpek nesnesiyim");
    }
}
class Kedi extends Hayvan{
    private String cinsi;
    public Kedi(String cinsi){
        setAyakSayisi(4);
        setCinsi(cinsi);
    }

    public String getCinsi() {
        return cinsi;
    }

    public void setCinsi(String cinsi) {
        this.cinsi = cinsi;
    }

    @Override
    public void adiniSoyle() {
        super.adiniSoyle();
        System.out.println("Ben kedi sınıfı nesnesiyim");
    }
}