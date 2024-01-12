package Buchhandel;

import java.util.ArrayList;
import java.util.Objects;

public abstract   class Book {
        protected String title;
        protected double price;
        protected String author;
        protected String category;
        protected ArrayList<Rating> ratings = new ArrayList<>();
        protected int bookID;
        protected static int bookIDCounter = 0;

    public Book(String title, double price, String author, String category) {
        this.title = title;
        this.price = price;
        this.author = author;
        switch (category) {
            case "Sachbuch":
            case "Roman":
            case "Krimi":
            case "Kinderbuch":
                this.category = category;
                break;
            default:
                this.category = "Sonstiges";
        }
        this.bookID = bookIDCounter++;
    }

    public void addRating(Rating rating) {
        ratings.add(rating);
    }

    public double calculateRating() {
        double sumStars = 0;

        for (Rating rating : ratings) {
            if (rating.getStars() == 0) {
                return -1;
            } else {
                sumStars += rating.getStars();
            }
        }

        return sumStars / ratings.size();
    }

    public abstract String printPresentationPage();

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public ArrayList<Rating> getRatings() {
        return ratings;
    }

    public int getBookID() {
        return bookID;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", category='" + category + '\'' +
                ", ratings=" + ratings +
                ", bookID=" + bookID +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(price, book.price) == 0 && bookID == book.bookID && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(category, book.category) && Objects.equals(ratings, book.ratings);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, author, category, ratings, bookID);
    }
}
