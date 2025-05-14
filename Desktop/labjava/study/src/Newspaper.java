public class Newspaper extends  Material implements Readable{

    public Newspaper(String title, String author, int pages, int readTime) {
        super(title, author, pages, readTime);
    }

    @Override
    public void read() {
        System.out.println("Skimming through the newspaper headlines...");
    }
    void printHeadline(){
        System.out.println("Headline");
    }
}
