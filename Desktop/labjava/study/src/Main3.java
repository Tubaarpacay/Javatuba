public class Main3 {
    public static void main(String[] args) {
        Material[] material={
                new Novel("Küçük prens","Auntonie",129,32),
                new Magazine("a","b",55,3),
                new Newspaper("c","d",40,1)
        };
        for(Material m : material){
            m.printDetails();
            m.read();
            if(m instanceof Novel){
                ((Novel)m).addBookmark();
            } else if (m instanceof Magazine) {
                ((Magazine)m).skipToPage(10);
            } else if (m instanceof  Newspaper) {
                ((Newspaper)m).printHeadline();
            }
            m.getEstimatedTime();
            System.out.println("--------------");
        }
    }
}
