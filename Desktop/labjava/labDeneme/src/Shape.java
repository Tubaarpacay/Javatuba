public class Shape {
    private Point location; // Tüm şekillerin bir konumu olur (x, y koordinatları)

    // Constructor: Konumu alır
    public Shape(Point location) {
        this.location = location; // Shape nesnesine konum atanır
    }

    // Getter: Konumu döndürür
    public Point getLocation() {
        return location;
    }

    // Setter: Konumu değiştirir
    public void setLocation(Point location) {
        this.location = location;
    }

    // Alan hesaplama (genel şekil için geçici; alt sınıflar override eder)
    public double area() {
        return 0;
    }

    // Çevre hesaplama (genel şekil için geçici; alt sınıflar override eder)
    public double perimeter() {
        return 0;
    }

    // Ekrana yazdırıldığında konum gösterilir
    @Override
    public String toString() {
        return "Shape at location: " + location;
    }
}
