package ru.korovko.patterns.creational.prototype;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Item> items = addItems();
        List<Item> cloned = getClonedList(items);
        compareObjects(items, cloned);
    }

    private static List<Item> addItems() {
        Book book = new Book();
        book.setCount(10000);
        book.setPrice(30);
        book.setTitle("Book title");
        book.setNumberOfPages(450);

        Book anotherBook = new Book();
        anotherBook.setTitle("Another book title");
        anotherBook.setCount(15000);
        anotherBook.setPrice(40);
        anotherBook.setNumberOfPages(520);

        Movie movie = new Movie();
        movie.setTitle("Movie title");
        movie.setCount(Integer.MAX_VALUE);
        movie.setPrice(5);
        movie.setRuntime(90);

        return List.of(book, anotherBook, movie);
    }

    private static List<Item> getClonedList(List<Item> itemsToClone) {
        return itemsToClone.stream()
                .map(Item::clone)
                .collect(Collectors.toList());
    }

    private static void compareObjects(List<Item> items, List<Item> cloned) {
        for (int i = 0; i < items.size(); i++) {
            Item currentItem = items.get(i);
            Item clonedCurrentItem = cloned.get(i);
            if (currentItem != clonedCurrentItem) {
                System.out.print("The references to objects are different, ");
                if (currentItem.equals(clonedCurrentItem)) {
                    System.out.println("but they are identical");
                }
            }
        }
    }
}
