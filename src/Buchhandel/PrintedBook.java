package Buchhandel;

public class PrintedBook extends Book{

    private int countPages;

    public PrintedBook(String title, double price, String author, String category, int countPages) {
        super(title, price, author, category);
        this.countPages = countPages;
    }

    @Override
    public String printPresentationPage() {

        for (Rating rating : ratings) {
            System.out.println("Titel: " +getTitle());
            System.out.println("Autor: " +getAuthor());
            System.out.println("Buchkategorie: " + getCategory());
            System.out.println("Rating: " + getRatings());
            System.out.println("Preis: "+ getPrice() + " EUR");
            System.out.println("Seiten: "+ countPages);
        }

        return null;
    }
}
