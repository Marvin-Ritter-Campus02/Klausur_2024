package Buchhandel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class BookStoreAnalyzer {
    private ArrayList<Book> books = new ArrayList<>();

    public BookStoreAnalyzer() {
    }

    public void addBook(Book book) {
        if (books.contains(book)) {
            System.out.println("Das befindet sich schon drin!");
        } else {
            books.add(book);
        }
    }

    public HashMap<String, Integer> getCountBooksInCategory() {

        HashMap<String, Integer> categoryCount = new HashMap<>();

        for (Book book : books) {
            Integer count = categoryCount.get(book.getCategory());
            categoryCount.put(book.getCategory(), (count == null) ? 1 : count + 1);
        }

        return categoryCount;
    }
}


