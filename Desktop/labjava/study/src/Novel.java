public class Novel extends Material implements  Readable{

    public Novel(String title, String author, int pages, int readTime) {
        super(title, author, pages, readTime);
    }

    @Override
    public void read() {
        System.out.println("Reading novel in deep silence ...");
    }
    void addBookmark(){
        System.out.println("Adding the novel: " +getTitle()  +", " +getAuthor()+ ", " +getPages() +", " +getReadTime()) ;
    }
}
