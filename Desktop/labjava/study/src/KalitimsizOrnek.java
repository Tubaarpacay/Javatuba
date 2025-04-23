public class KalitimsizOrnek {
    public static void main(String[] args) {
        Personel mudur=new Personel("tuba",1007417,20);
        System.out.println(mudur);
        Ogrenciler emre=new Ogrenciler("emre",9,12345,423);
        System.out.println(emre);
    }
}
class Personel{
    private String isim;
    private long tcKimlik;
    private int yas;
    public Personel(){
        isim="Henüz atanmadı";
        tcKimlik=0;
        yas=18;
    }

    public Personel(String isim, long tcKimlik, int yas) {
        this.isim = isim;
        this.tcKimlik = tcKimlik;
        setYas(yas);
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>=18)
           this.yas = yas;
        else this.yas=18;
    }

    @Override
    public String toString() {
        return "Ad:" +isim +" tckimlik:" +tcKimlik+" yas:" +yas;
    }
}
class Ogrenciler{
    private String isim;
    private int yas;
    private long tcKimlik;
    private int okulNo;

    public Ogrenciler(){
        isim="Henüz atanmadı";
        tcKimlik=0;
        yas=7;
        okulNo=5000;
    }
    public Ogrenciler(String isim, int yas, long tcKimlik, int okulNo) {
        this.isim = isim;
        setYas(yas);
        this.tcKimlik = tcKimlik;
        this.okulNo = okulNo;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        if(yas>=7)
          this.yas = yas;
        else this.yas=7;
    }

    public long getTcKimlik() {
        return tcKimlik;
    }

    public void setTcKimlik(long tcKimlik) {
        this.tcKimlik = tcKimlik;
    }

    public int getOkulNo() {
        return okulNo;
    }

    public void setOkulNo(int okulNo) {
        this.okulNo = okulNo;
    }

    @Override
    public String toString() {
        return
                "isim='" + isim + '\'' +
                ", yas=" + yas +
                ", tcKimlik=" + tcKimlik +
                ", okulNo=" + okulNo
                ;
    }
}
