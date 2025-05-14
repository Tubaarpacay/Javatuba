public class Book {
    private String name;
    private String autor;

    public Book(String name, String autor) {
        this.name = name;
        this.autor = autor;
    }
    public void bookInformation(){
        System.out.println("Book :" +name + " Autor :" +autor);

    }
}
