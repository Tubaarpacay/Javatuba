public class DiziGondermekAlmak {
    public static void main(String[] args) {
        int sayilar[]={1,2,3};
        diziGoster(sayilar);
        System.out.println("metotttan önce index 0:" +sayilar[0]);
        degeriBirArtir(sayilar[0]);
        System.out.println("metottan sora index 0:" +sayilar[0]);
        System.out.println("dizi değerlerini artırmadan önce ");
        diziGoster(sayilar);
        diziDegerleriniBirArtir(sayilar);
        System.out.println("dizi değerlerini artırmadan sonra ");
        diziGoster(sayilar);
        toplaminiBul(9,12);
        toplaminiBul(5,7,4);
        toplaminiBul(5,7,18,12,3,4,6,90,16);
    }
    private static void toplaminiBul(int... parametreListesi){
        int toplam=0;
        for (int nowsayi:parametreListesi){
            toplam=toplam+nowsayi;
        }
        System.out.println("gelen parametrelerin toplamı:" +toplam);
    }
    private static void toplaminiBul(int i,int j){
        int toplam=0;
        toplam=i+j;
        System.out.println("toplam1:" +toplam);
    }
    private static void toplaminiBul(int i,int j,int a){
        int toplam=0;
        toplam=i+j+a;
        System.out.println("toplam2:" +toplam);
    }
    private static void diziDegerleriniBirArtir(int[] sayilar) {
        sayilar[0]++;
        sayilar[1]++;
        sayilar[2]++;
    }

    private static void degeriBirArtir(int i) {
        i++;
    }

    private static void diziGoster(int[] dizi) {
        for(int i:dizi){
            System.out.println("eleman:" +i);
        }
    }
}
