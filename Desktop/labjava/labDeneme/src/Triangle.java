public class Triangle extends Shape {
    private int sideA, sideB, sideC; // Üçgenin 3 kenarı

    // Constructor: Konum ve 3 kenar değeri alır
    public Triangle(Point location, int sideA, int sideB, int sideC) {
        super(location);       // Üst sınıf olan Shape'e konum gönderilir
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    // Getter ve Setter metodları
    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        this.sideB = sideB;
    }

    public int getSideC() {
        return sideC;
    }

    public void setSideC(int sideC) {
        this.sideC = sideC;
    }

    // Üçgenin çevresi = a + b + c
    @Override
    public double perimeter() {
        return sideA + sideB + sideC;
    }

    // Üçgenin alanı → Heron formülü
    @Override
    public double area() {
        double s = perimeter() / 2.0; // yarı çevre
        return Math.sqrt(s * (s - sideA) * (s - sideB) * (s - sideC));
    }

    // Ekrana üçgen bilgilerini düzgün şekilde yazdırır
    @Override
    public String toString() {
        return "Triangle{" +
                "sideA=" + sideA +
                ", sideB=" + sideB +
                ", sideC=" + sideC +
                ", location=" + getLocation() +
                '}';
    }
}
