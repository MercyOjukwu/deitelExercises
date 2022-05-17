package designPatternsStuff;

public class Pray{
    private final String bibleVerse;
    private final int chapter;

    public Pray(String bibleVerse, int chapter){
        this.bibleVerse = bibleVerse;
        this.chapter = chapter;
    }
    public void pray(){
        System.out.println("Pray often");
    }
}
