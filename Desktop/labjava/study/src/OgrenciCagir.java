public class OgrenciCagir {
    public static void main(String[] args) {
        int sayi=1;
        Ogrenci emre=new Ogrenci();
        emre.name="emre altınbilek";
        emre.sinif=9;
        emre.studentId=231;
        emre.aktif=true;
        emre.studentInfo();

        Ogrenci hasan=new Ogrenci();
        hasan.name="kürt hasan";
        hasan.sinif=11;
        hasan.studentId=423;
        hasan.aktif=true;
        hasan.studentInfo(); 
    }
}
