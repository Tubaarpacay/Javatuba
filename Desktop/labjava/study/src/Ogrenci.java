public class Ogrenci {
    int studentId;
    String name;
    byte sinif;
    boolean aktif;
    public Ogrenci(){
        System.out.println("öğrenci nesnesi oluşturuluyor");
    }
    public void dersAl(){
        System.out.println("öğrenci ders alıyor");
    }
    public void studentInfo() {
        if (aktif) {
            System.out.println(" adım : " + name + " numaram : " + studentId + " sınıfım : " + sinif);
        }else{
            System.out.println("bu öğrenci aktif değil");
        }
    }
}
