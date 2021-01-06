package ru.korovko.patterns.creational.prototype;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
public class Movie extends Item {

    private int runtime;

    public Movie(Movie target) {
        super(target);
        if (target != null) {
            this.runtime = target.runtime;
        }
    }

    @Override
    public Item clone() {
        return new Movie(this);
    }
}
