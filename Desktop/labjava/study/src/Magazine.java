public class Magazine extends  Material implements  Readable{

    public Magazine(String title, String author, int pages, int readTime) {
        super(title, author, pages, readTime);
    }

    @Override
    public void read() {
        System.out.println("Browsing through the magazine");
    }
    void skipToPage(int page){
        System.out.println(page);
    }
}
