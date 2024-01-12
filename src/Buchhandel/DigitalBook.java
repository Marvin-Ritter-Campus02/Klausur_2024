package Buchhandel;

public class DigitalBook extends Book {
    private String fileName;
    private int fileSize;

    public DigitalBook(String title, double price, String author, String category, String fileName, int fileSize) {
        super(title, price, author, category);
        this.fileName = fileName;
        this.fileSize = fileSize;
    }

    @Override
    public String printPresentationPage() {

        for (Rating rating : ratings) {
            System.out.println("Titel: " +getTitle());
            System.out.println("Autor: " +getAuthor());
            System.out.println("Buchkategorie: " + getCategory());
            System.out.println("Rating: " + getRatings());
            System.out.println("Datei: "+ fileName + ", "+ fileSize+ " KB");
        }
        return null;
    }
}
