package ru.korovko.patterns.creational.prototype;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public abstract class Item {

    private String title;
    private double price;
    private int count;

    public Item(Item target) {
        if (target != null) {
            this.title = target.title;
            this.price = target.price;
            this.count = target.count;
        }
    }

    public abstract Item clone();
}
