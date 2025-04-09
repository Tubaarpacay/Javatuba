public class Point {
    private int x, y; // Noktanın x ve y koordinatları (private: sadece bu sınıf erişebilir)

    // Constructor: Bu sınıftan nesne oluştururken x ve y değerlerini alır
    public Point(int x, int y) {
        this.x = x; // this.x → sınıfın içindeki x
        this.y = y;
    }

    // Getter: x değerini döndürür
    public int getX() {
        return x;
    }

    // Getter: y değerini döndürür
    public int getY() {
        return y;
    }

    // Override edilmiş toString metodu → ekrana yazdırıldığında "(x, y)" gibi görünmesini sağlar
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
