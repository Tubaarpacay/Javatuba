public class Immutable {
    public static void main(String[] args) {
         String[] ureticiFirmalar={"HP","Fujitsu","Dell"};
         Bilgisayar b1=new Bilgisayar(8,32,ureticiFirmalar);
         bilgisayarYazdir(b1);
         String[] ureticiler= b1.getUreticiFirmalari();
         ureticiler[0]="Apple";
         bilgisayarYazdir(b1);
    }
    public static void bilgisayarYazdir(Bilgisayar yazdirilacakPC){
        System.out.println("Çekirdek sayısı :"+yazdirilacakPC.getCekirdekSayisi()+"ram miktarı" +yazdirilacakPC.getRamBoyutu()+"firmalar" +yazdirilacakPC.getUreticiFirmalari()[0]);
    }
}

class Bilgisayar{
    private int cekirdekSayisi;
    private int ramBoyutu;
    private String[] ureticiFirmalar;

    public Bilgisayar(int cSayisi,int ramBoyutu,String[] ureticiFirmalar){
         this.cekirdekSayisi=cSayisi;
         this.ramBoyutu=ramBoyutu;
         this.ureticiFirmalar=ureticiFirmalar;
    }
    public int getCekirdekSayisi() {
        return cekirdekSayisi;
    }

    public int getRamBoyutu() {
        return ramBoyutu;
    }

    public String[] getUreticiFirmalari() {
        String[] kopyaFirmalar=new String[ureticiFirmalar.length];
        for (int i = 0; i <kopyaFirmalar.length ; i++) {
            kopyaFirmalar[i]=ureticiFirmalar[i];
        }
        return kopyaFirmalar;
    }

}