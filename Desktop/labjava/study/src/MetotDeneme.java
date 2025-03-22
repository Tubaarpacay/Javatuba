public class MetotDeneme {
    public static void main(String[] args) {
        menuGoster();
        sayilariTopla(10,15);
        int sayi=5;
        sayiDeğiştir(sayi);
        System.out.println("sayının değeri :" +sayi);
        System.out.println("fark :" +sayi);
        sayilarinFarki(10,6);
    }

    public static void   sayilarinFarki(int i,int j) {
        System.out.println("sayıların farkı :" +(i-j));
        
    }

    public static void sayiDeğiştir(int x) {
        x=x+10;
        System.out.println("gönderilen sayının 10 fazlası :" +x);
    }
    //parametre alan metot örneği
    public static void sayilariTopla(int a, int b){
        System.out.println("toplam :" +(a+b));
    }

    //parametre almayan ve geriye değer döndürmeyen metot.
    public static void menuGoster(){
        System.out.println("*******MENU*******");
        System.out.println("1.İki sayının toplamını bul");
        System.out.println("2.İki sayının farkını bul");
        System.out.println("3.İki sayının çarpımını bul");
        System.out.println("4.İki sayının bölümünü bul");
    }
}
