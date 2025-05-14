public class LibrarySystem {
    public static void main(String[] args) {
        Book book1=new Book("simyacı","Paulo  ");
        Book book2=new Book("Küçük prens","Antonie");
        book1.bookInformation();
        book2.bookInformation();

        Book[] books={book1,book2};
        Library library=new Library("Center library",books);
        library.libraryInformantiom();

     }
}
