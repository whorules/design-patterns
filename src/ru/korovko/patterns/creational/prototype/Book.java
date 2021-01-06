package ru.korovko.patterns.creational.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Book extends Item {

    private int numberOfPages;

    public Book(Book target) {
        super(target);
        if (target != null) {
            this.numberOfPages = target.numberOfPages;
        }
    }

    @Override
    public Item clone() {
        return new Book(this);
    }
}
