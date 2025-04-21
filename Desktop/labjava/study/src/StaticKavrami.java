public class StaticKavrami {

    public static void main(String[] args) {
        Memur m1=new Memur();
        m1.setIsim("tuba");
        m1.setMaas(4000);

        Memur m2=new Memur();
        m2.setIsim("irem");
        m2.setMaas(4500);


        Memur m3=new Memur();
        m3.setIsim("şeyma");
        m3.setMaas(5000);
        m3.bilgileriGoster();
        Memur.kanunuSoyle();
        m3.kanunuSoyle();
        m2.kanunuSoyle();
        m1.kanunuSoyle();

    }
}

class Memur{
    private String  isim;
    private int maas;
    public static int olusurulanMemurNesnesi; //nesneye bağlı değilde classa bağlı olsun istedik.
    public  Memur(){
        olusurulanMemurNesnesi++;
    }
    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getMaas() {
        return maas;
    }

    public void setMaas(int maas) {
        if(maas<0){
            maas=0;
        }else{
            this.maas = maas;
        }

    }
    public static void kanunuSoyle(){
        System.out.println("657 nolu kanun geçerli");
    }
    public void bilgileriGoster(){
        kanunuSoyle();
        System.out.println("oluşturulan memur nesnesi :" +olusurulanMemurNesnesi);
    }
}