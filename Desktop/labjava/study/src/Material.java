public abstract class Material implements Readable {
    private String title;
    private String author;
    private int pages;
    private int readTime;

    public Material(String title, String author, int pages, int readTime) {
        this.title = title;
        this.author = author;
        this.pages = pages;
        this.readTime = readTime;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getReadTime() {
        return readTime;
    }
    void printDetails(){
        System.out.println("Title: " + title + " | Author: " + author + " | Pages: " +pages);
    }
    void getEstimatedTime(){
        System.out.println("Estimated time: " +readTime);
    }
}
