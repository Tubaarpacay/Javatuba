public class Library {
    String name;
    Book[] books;

    public Library(String name, Book[] books) {
        this.name = name;
        this.books = books;
    }
    public void libraryInformantiom(){
        System.out.println("Lİbrary :" + name);
        for(Book book: books){
            book.bookInformation();
        }
    }
}
