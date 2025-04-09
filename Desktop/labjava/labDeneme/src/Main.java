public class Main {
    public static void main(String[] args) {
        // (3, 4) konumunda bir nokta (Point) oluştur
        Point location = new Point(3, 4);

        // Bu noktada 3 kenarlı bir üçgen oluştur: 3, 4, 5 (dik üçgen)
        Triangle triangle = new Triangle(location, 3, 4, 5);

        // Bilgileri ekrana yazdıralım
        System.out.println("Üçgen Bilgileri:");
        System.out.println(triangle);

        System.out.println("Alan: " + triangle.area()); // Heron formülüne göre hesaplanır
        System.out.println("Çevre: " + triangle.perimeter());
    }
}
