package Buchhandel;

public class Demo {
    public static void main(String[] args) {


        PrintedBook printedBook1 = new PrintedBook("Kobolde", 14,"Daniel Zettel","Erotik",74);
        DigitalBook digitalBook1 = new DigitalBook("Haustiere auf Jagt", 11, "Stephan Kochauf", "Kinderbuch", "stephans_secrets", 147);

        System.out.println(printedBook1);
        System.out.println(digitalBook1);

        printedBook1.addRating(new Rating(9,"War echt spannend"));
        digitalBook1.addRating(new Rating(7,"Ein gutes Buch!"));
        System.out.println();
        printedBook1.printPresentationPage();
        System.out.println();
        digitalBook1.printPresentationPage();
        System.out.println();
        BookStoreAnalyzer bookStoreAnalyzer = new BookStoreAnalyzer();

        bookStoreAnalyzer.addBook(printedBook1);
        bookStoreAnalyzer.addBook(printedBook1);
        bookStoreAnalyzer.addBook(digitalBook1);

        System.out.println(bookStoreAnalyzer.getCountBooksInCategory());


    }
}
